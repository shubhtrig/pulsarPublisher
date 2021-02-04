/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.publisher;

import com.narvar.automate.queuePublisher.exception.CommerceException;
import com.narvar.automate.queuePublisher.exception.ExceptionCode;
import com.narvar.automate.queuePublisher.queue.PulsarClient;
import com.narvar.automate.queuePublisher.queue.message.PulsarMessage;
import org.apache.pulsar.client.api.Producer;
import org.apache.pulsar.client.api.ProducerBuilder;
import org.apache.pulsar.client.api.PulsarClientException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

/**
 * Pulsar Publisher using {@link PulsarClient}.
 * The Publisher is abstracts common functions across all publishers.
 * The Publisher is intialized as part of {@link PostConstruct}. The publisher is tagged to {@link PulsarMessage}.
 * The Publisher is closed as part of {@link PreDestroy}.
 */
public abstract class AbstractPulsarPublisher<T extends PulsarMessage> {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractPulsarPublisher.class);

    @Autowired
    private PulsarClient client;
    private Producer<T> producer;
    private String topicName;
    Class<T> clazz;

    public AbstractPulsarPublisher(String topicName, Class<T> clazz) {
        this.topicName = topicName;
        this.clazz = clazz;
    }

    @PostConstruct
    private void init() {
        try {
            ProducerBuilder<T> producerBuilder = client.getProducerBuilder(clazz);
            this.producer = producerBuilder
                    .topic(this.topicName)
                    .blockIfQueueFull(true)
                    .create();
        } catch (final PulsarClientException ex) {
            LOG.error("Could not create pulsar client", ex);
            throw new BeanInitializationException("Could not create pulsar client", ex);
        }
    }

    public void publish(T message) throws CommerceException {
        try {
            this.producer.send(message);
            LOG.trace("PulsarService: PulsarMessage published successfully message :{}", message);
        } catch (final PulsarClientException ex) {
            LOG.error("PulsarService: Failed to publish message to pulsar queue message :{}", message, ex);
            throw new CommerceException(ExceptionCode.PUBLISHER_ERROR);
        }
    }

    @PreDestroy
    private void preDestroy() throws PulsarClientException {
        this.producer.close();
    }
}
