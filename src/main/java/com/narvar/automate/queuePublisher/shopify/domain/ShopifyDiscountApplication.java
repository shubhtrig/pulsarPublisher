/*
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
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
        "type",
        "title",
        "description",
        "value",
        "value_type",
        "allocation_method",
        "target_selection",
        "target_type",
        "code"
})
public class ShopifyDiscountApplication  implements Serializable {

    @JsonProperty("type")
    public String type;
    @JsonProperty("title")
    public String title;
    @JsonProperty("description")
    public String description;
    @JsonProperty("value")
    public String value;
    @JsonProperty("value_type")
    public String valueType;
    @JsonProperty("allocation_method")
    public String allocationMethod;
    @JsonProperty("target_selection")
    public String targetSelection;
    @JsonProperty("target_type")
    public String targetType;
    @JsonProperty("code")
    public String code;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}