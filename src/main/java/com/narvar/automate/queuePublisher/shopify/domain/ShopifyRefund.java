/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.domain;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "order_id",
        "created_at",
        "note",
        "user_id",
        "processed_at",
        "refund_line_items",
        "transactions",
        "order_adjustments"
})
public class ShopifyRefund implements Serializable {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("order_id")
    public Long orderId;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("note")
    public String note;
    @JsonProperty("user_id")
    public String userId;
    @JsonProperty("processed_at")
    public String processedAt;
    @JsonProperty("refund_line_items")
    public List<ShopifyRefundLineItem> refundLineItems;
    @JsonProperty("transactions")
    public List<ShopifyTransaction> transactions;
    @JsonProperty("order_adjustments")
    public List<String> orderAdjustments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}