/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.message;

import com.narvar.automate.queuePublisher.constants.ResourceType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

/**
 * Message container for shopify Range information.
 * This message is processed by
 */
@Data
@ToString(callSuper = true)
@NoArgsConstructor
public class ShopifyRangeMessage extends PulsarMessage {

    private Long startId;
    private Long endId;
    private Set<Long> ids;
    private ResourceType type;

    public ShopifyRangeMessage(Long startId, Long endId, ResourceType type) {
        this.startId = startId;
        this.endId = endId;
        this.type = type;
    }

    public ShopifyRangeMessage(Set<Long> ids, ResourceType type) {
        this.ids = ids;
        this.type = type;
    }

}
