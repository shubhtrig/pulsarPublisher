/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.constants;

/**
 * Resource Type representation to be used across the application.
 */
public enum ResourceType {

    PRODUCT("PRODUCT", "products/updated"),
    ORDER("ORDER", "orders/updated");

    private final String type;
    private String topicName;

    ResourceType(final String type, final String topicName) {
        this.type = type;
        this.topicName = topicName;
    }

    public String getType() {
        return this.type;
    }

    public String getTopicName() {
        return this.topicName;
    }
}
