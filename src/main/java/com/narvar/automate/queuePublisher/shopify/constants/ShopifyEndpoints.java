/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.constants;

/**
 * Shopify Endpoints.
 */
public final class ShopifyEndpoints {
    private static final String ROOT = "/admin";

    private ShopifyEndpoints() {

    }

    public static final class ORDER {
        public static final String API_ROOT = ROOT + "/orders";
        public static final String API_ROOT_JSON = ROOT + "/orders.json";
        public static final String COUNT_JSON = API_ROOT + "/count.json";

        private ORDER() {

        }
    }

    public static final class PRODUCT {
        public static final String API_ROOT = ROOT + "/products";
        public static final String API_ROOT_JSON = ROOT + "/products.json";
        public static final String COUNT_JSON = API_ROOT + "/count.json";

        private PRODUCT() {

        }
    }
}
