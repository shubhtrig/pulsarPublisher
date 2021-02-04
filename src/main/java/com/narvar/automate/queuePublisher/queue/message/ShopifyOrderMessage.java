/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.message;

import com.narvar.automate.queuePublisher.shopify.domain.ShopifyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class ShopifyOrderMessage extends ShopifyResourceMessage {
    private ShopifyOrder shopifyOrder;

    public ShopifyOrderMessage(String event, Boolean isPull, ShopifyOrder shopifyOrder) {
        super(event, isPull);
        this.shopifyOrder = shopifyOrder;
    }
}
