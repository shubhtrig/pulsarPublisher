/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.message;

import com.narvar.automate.queuePublisher.shopify.domain.ShopifyProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Message container for {@link ShopifyProduct}.
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ShopifyProductMessage extends ShopifyResourceMessage {
    private ShopifyProduct shopifyProduct;

    public ShopifyProductMessage(String event, Boolean isPull, ShopifyProduct shopifyProduct) {
        super(event, isPull);
        this.shopifyProduct = shopifyProduct;
    }
}
