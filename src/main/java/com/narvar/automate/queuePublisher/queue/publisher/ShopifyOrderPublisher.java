/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.publisher;

import com.narvar.automate.queuePublisher.constants.PropertyConstants;
import com.narvar.automate.queuePublisher.queue.PulsarClient;
import com.narvar.automate.queuePublisher.queue.message.ShopifyOrderMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Pulsar Publisher using {@link PulsarClient}.
 * The Publisher is intialized as part of {@link PostConstruct}. The publisher is tagged to {@link ShopifyOrderMessage}.
 * The Publisher is closed as part of {@link PreDestroy}.
 */
@Service
public class ShopifyOrderPublisher extends AbstractPulsarPublisher<ShopifyOrderMessage> {

    private static final Logger LOG = LoggerFactory.getLogger(ShopifyOrderPublisher.class);

    @Autowired
    public ShopifyOrderPublisher(@Value("${" + PropertyConstants.PULSAR_SHOPIFY_ORDER_TOPIC_NAME + "}") String topicName) {
        super(topicName, ShopifyOrderMessage.class);
    }
}
