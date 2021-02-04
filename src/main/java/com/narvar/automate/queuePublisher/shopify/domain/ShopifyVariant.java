
/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "product_id",
        "title",
        "price",
        "sku",
        "position",
        "inventory_policy",
        "compare_at_price",
        "fulfillment_service",
        "inventory_management",
        "option1",
        "option2",
        "option3",
        "created_at",
        "updated_at",
        "taxable",
        "barcode",
        "grams",
        "image_id",
        "weight",
        "weight_unit",
        "inventory_item_id",
        "inventory_quantity",
        "old_inventory_quantity",
        "requires_shipping",
        "admin_graphql_api_id"
})
public class ShopifyVariant implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("inventory_policy")
    private String inventoryPolicy;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("inventory_management")
    private String inventoryManagement;
    @JsonProperty("option1")
    private String option1;
    @JsonProperty("option2")
    private String option2;
    @JsonProperty("option3")
    private String option3;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("taxable")
    private Boolean taxable;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("grams")
    private Integer grams;
    @JsonProperty("image_id")
    private Object imageId;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("inventory_item_id")
    private Long inventoryItemId;
    @JsonProperty("inventory_quantity")
    private Integer inventoryQuantity;
    @JsonProperty("old_inventory_quantity")
    private Integer oldInventoryQuantity;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();
}
