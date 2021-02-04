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
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "order_id",
        "refund_id",
        "amount",
        "tax_amount",
        "kind",
        "reason",
        "amount_set",
        "tax_amount_set"
})
public class ShopifyOrderAdjustment implements Serializable {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("order_id")
    public Integer orderId;
    @JsonProperty("refund_id")
    public Integer refundId;
    @JsonProperty("amount")
    public String amount;
    @JsonProperty("tax_amount")
    public String taxAmount;
    @JsonProperty("kind")
    public String kind;
    @JsonProperty("reason")
    public String reason;
    @JsonProperty("amount_set")
    public ShopifyAmountSet amountSet;
    @JsonProperty("tax_amount_set")
    public ShopifyTaxAmountSet taxAmountSet;
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