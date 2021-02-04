package com.narvar.automate.queuePublisher.controller;

import com.narvar.automate.queuePublisher.shopify.domain.ShopifyOrder;
import lombok.Data;

import java.util.List;

@Data
public class QueueRequest {
    private String store;
    private String topicName;
    private String endpoint;
    private int repeat;
    private ShopifyOrder shopifyOrder;
    private List<Long> productIds;
    private List<Long> variantIds;
}
