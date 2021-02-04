
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
        "variant_id",
        "title",
        "quantity",
        "sku",
        "variant_title",
        "vendor",
        "fulfillment_service",
        "product_id",
        "requires_shipping",
        "taxable",
        "gift_card",
        "name",
        "variant_inventory_management",
        "properties",
        "product_exists",
        "fulfillable_quantity",
        "grams",
        "price",
        "total_discount",
        "fulfillment_status",
        "price_set",
        "total_discount_set",
        "discount_allocations",
        "admin_graphql_api_id",
        "tax_lines",
        "origin_location"
})
public class ShopifyLineItem implements Serializable {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("variant_id")
    public Long variantId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("quantity")
    public Integer quantity;
    @JsonProperty("sku")
    public String sku;
    @JsonProperty("variant_title")
    public String variantTitle;
    @JsonProperty("vendor")
    public String vendor;
    @JsonProperty("fulfillment_service")
    public String fulfillmentService;
    @JsonProperty("product_id")
    public Long productId;
    @JsonProperty("requires_shipping")
    public Boolean requiresShipping;
    @JsonProperty("taxable")
    public Boolean taxable;
    @JsonProperty("gift_card")
    public Boolean giftCard;
    @JsonProperty("name")
    public String name;
    @JsonProperty("variant_inventory_management")
    public String variantInventoryManagement;
    @JsonProperty("properties")
    @Valid
    public List<Object> properties = null;
    @JsonProperty("product_exists")
    public Boolean productExists;
    @JsonProperty("fulfillable_quantity")
    public Integer fulfillableQuantity;
    @JsonProperty("grams")
    public Integer grams;
    @JsonProperty("price")
    public String price;
    @JsonProperty("total_discount")
    public String totalDiscount;
    @JsonProperty("fulfillment_status")
    public String fulfillmentStatus;
    @JsonProperty("price_set")
    @Valid
    public ShopifyPriceSet shopifyPriceSet;
    @JsonProperty("total_discount_set")
    @Valid
    public ShopifyTotalDiscountSet shopifyTotalDiscountSet;
    @JsonProperty("discount_allocations")
    @Valid
    public List<ShopifyDiscountAllocation> discountAllocations = null;
    @JsonProperty("admin_graphql_api_id")
    public String adminGraphqlApiId;
    @JsonProperty("tax_lines")
    @Valid
    public List<ShopifyTaxLine> shopifyTaxLines = null;
    @JsonProperty("origin_location")
    @Valid
    public ShopifyOriginLocation shopifyOriginLocation;
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
