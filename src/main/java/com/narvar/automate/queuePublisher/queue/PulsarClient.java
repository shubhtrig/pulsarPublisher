/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue;

import com.narvar.automate.queuePublisher.constants.PropertyConstants;
import com.narvar.automate.queuePublisher.queue.message.PulsarMessage;
import org.apache.pulsar.client.api.ProducerBuilder;
import org.apache.pulsar.client.api.PulsarClientException;
import org.apache.pulsar.client.api.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * The Application Pulsar Client.
 * The client is initialized as part of {@link PostConstruct}.
 * The Client is closed as part of {@link PreDestroy}.
 */
@Component
public class PulsarClient {
    private static final Logger LOG = LoggerFactory.getLogger(PulsarClient.class);
    private static final String PULSAR_URL_FORMAT = "pulsar://%s:%s";

    private org.apache.pulsar.client.api.PulsarClient client;

    @Value("${" + PropertyConstants.PULSAR_HOST + ":localhost}")
    private String pulsarHost;
    @Value("${" + PropertyConstants.PULSAR_PORT + ":6650}")
    private String pulsarPort;

    @PostConstruct
    private void init() {
        try {
            String pulsarUrl = String.format(PULSAR_URL_FORMAT, pulsarHost, pulsarPort);
            this.client = org.apache.pulsar.client.api.PulsarClient.builder()
                    .serviceUrl(pulsarUrl)
                    .build();
        } catch (final PulsarClientException ex) {
            LOG.error("Could not create pulsar client", ex);
            throw new BeanInitializationException("Could not create pulsar client", ex);
        }
    }

    public org.apache.pulsar.client.api.PulsarClient getPulsarClient() {
        return this.client;
    }

    public <T extends PulsarMessage> ProducerBuilder<T> getProducerBuilder(Class<T> clazz) {
        return this.client.newProducer(Schema.JSON(clazz));
    }

    @PreDestroy
    private void preDestroy() throws PulsarClientException {
        this.client.close();
    }
}
