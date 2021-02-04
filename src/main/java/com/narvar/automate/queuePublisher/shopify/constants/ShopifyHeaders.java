/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.constants;

import org.springframework.http.HttpHeaders;

/**
 * Shopify Headers.
 */
public class ShopifyHeaders extends HttpHeaders {

    public static final String ACCESS_TOKEN = "X-Shopify-Access-Token";
    public static final String SHOPIFY_SHOP_DOMAIN = "x-shopify-shop-domain";
    public static final String SHOPIFY_TOPIC = "x-shopify-topic";
    public static final String SHOPIFY_SHOP_API_CALL_LIMIT = "X-Shopify-Shop-Api-Call-Limit";
}
