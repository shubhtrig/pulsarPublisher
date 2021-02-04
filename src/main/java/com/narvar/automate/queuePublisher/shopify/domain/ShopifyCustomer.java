
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
import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "email",
        "accepts_marketing",
        "created_at",
        "updated_at",
        "first_name",
        "last_name",
        "orders_count",
        "state",
        "total_spent",
        "last_order_id",
        "note",
        "verified_email",
        "multipass_identifier",
        "tax_exempt",
        "phone",
        "tags",
        "last_order_name",
        "currency",
        "accepts_marketing_updated_at",
        "marketing_opt_in_level",
        "admin_graphql_api_id",
        "default_address"
})
public class ShopifyCustomer implements Serializable {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("email")
    public String email;
    @JsonProperty("accepts_marketing")
    public Boolean acceptsMarketing;
    @JsonProperty("created_at")
    public String createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("orders_count")
    public Integer ordersCount;
    @JsonProperty("state")
    public String state;
    @JsonProperty("total_spent")
    public String totalSpent;
    @JsonProperty("last_order_id")
    public Long lastOrderId;
    @JsonProperty("note")
    public Object note;
    @JsonProperty("verified_email")
    public Boolean verifiedEmail;
    @JsonProperty("multipass_identifier")
    public Object multipassIdentifier;
    @JsonProperty("tax_exempt")
    public Boolean taxExempt;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("tags")
    public String tags;
    @JsonProperty("last_order_name")
    public String lastOrderName;
    @JsonProperty("currency")
    public String currency;
    @JsonProperty("accepts_marketing_updated_at")
    public String acceptsMarketingUpdatedAt;
    @JsonProperty("marketing_opt_in_level")
    public Object marketingOptInLevel;
    @JsonProperty("admin_graphql_api_id")
    public String adminGraphqlApiId;
    @JsonProperty("default_address")
    @Valid
    public ShopifyDefaultAddress shopifyDefaultAddress;
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
