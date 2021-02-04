/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.constants;

/**
 * Generic constants for Shopify.
 */
public class ShopifyConstants {
    public static final String IMAGE = "image";

    private ShopifyConstants() {

    }

    public class RateLimitKeys {
        public static final String MAX_COUNT = "%s_MAX_COUNT";
        public static final String CURRENT_COUNT = "%s_CURRENT_COUNT";
        public static final String LIMIT_REFRESH = "%s_LIMIT_REFRESH";
    }
}
