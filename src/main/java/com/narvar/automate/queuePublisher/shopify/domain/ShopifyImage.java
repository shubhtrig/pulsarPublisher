
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
import java.util.List;
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "product_id",
        "position",
        "created_at",
        "updated_at",
        "alt",
        "width",
        "height",
        "src",
        "variant_ids",
        "admin_graphql_api_id"
})
public class ShopifyImage implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("product_id")
    private Long productId;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("alt")
    private Object alt;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("src")
    private String src;
    @JsonProperty("variant_ids")
    private List<Long> variantIds = null;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

}
