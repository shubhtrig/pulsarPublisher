
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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "price",
        "code",
        "source",
        "phone",
        "requested_fulfillment_service_id",
        "delivery_category",
        "carrier_identifier",
        "discounted_price",
        "price_set",
        "discounted_price_set",
        "discount_allocations",
        "tax_lines"
})
public class ShopifyShippingLine implements Serializable {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("title")
    public String title;
    @JsonProperty("price")
    public String price;
    @JsonProperty("code")
    public String code;
    @JsonProperty("source")
    public String source;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("requested_fulfillment_service_id")
    public String requestedFulfillmentServiceId;
    @JsonProperty("delivery_category")
    public String deliveryCategory;
    @JsonProperty("carrier_identifier")
    public String carrierIdentifier;
    @JsonProperty("discounted_price")
    public String discountedPrice;
    @JsonProperty("price_set")
    @Valid
    public ShopifyPriceSet shopifyPriceSet;
    @JsonProperty("discounted_price_set")
    @Valid
    public ShopifyDiscountedPriceSet shopifyDiscountedPriceSet;
    @JsonProperty("discount_allocations")
    @Valid
    private List<String> discountAllocations;
    @JsonProperty("tax_lines")
    @Valid
    private List<String> taxLines;
    @JsonIgnore
    @Valid
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
