/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.constants;

public final class PropertyConstants {
    // Pulsar client config constants

    public static final String PULSAR_HOST = "pulsar.host";

    public static final String PULSAR_PORT = "pulsar.port";

    public static final String PULSAR_LISTENER_COUNT = "pulsar.listener.count";
    public static final String PULSAR_SHOPIFY_ORDER_TOPIC_NAME = "shopify.order.topic";
    public static final String PULSAR_SHOPIFY_PRODUCT_TOPIC_NAME = "shopify.product.topic";
    public static final String ORDER_JSON = "order.json";
    public static final String PULSAR_SHOPIFY_RANGE_TOPIC_NAME = "shopify.range.topic";

    private PropertyConstants() {}
}
