
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
        "title",
        "body_html",
        "vendor",
        "product_type",
        "created_at",
        "handle",
        "updated_at",
        "published_at",
        "template_suffix",
        "tags",
        "published_scope",
        "admin_graphql_api_id",
        "variants",
        "options",
        "images",
        "image"
})
public class ShopifyProduct implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body_html")
    private String bodyHtml;
    @JsonProperty("vendor")
    private String vendor;
    @JsonProperty("product_type")
    private String productType;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("handle")
    private String handle;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("template_suffix")
    private Object templateSuffix;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("published_scope")
    private String publishedScope;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("variants")
    private List<ShopifyVariant> shopifyVariants = null;
    @JsonProperty("options")
    private List<ShopifyOption> shopifyOptions = null;
    @JsonProperty("images")
    private List<ShopifyImage> shopifyImages = null;
    @JsonProperty("image")
    private ShopifyImage image;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

}
