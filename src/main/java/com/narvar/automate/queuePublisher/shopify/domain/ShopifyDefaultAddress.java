
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
        "customer_id",
        "first_name",
        "last_name",
        "company",
        "address1",
        "address2",
        "city",
        "province",
        "country",
        "zip",
        "phone",
        "name",
        "province_code",
        "country_code",
        "country_name",
        "default"
})
public class ShopifyDefaultAddress implements Serializable {

    @JsonProperty("id")
    public Long id;
    @JsonProperty("customer_id")
    public Long customerId;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("company")
    public Object company;
    @JsonProperty("address1")
    public String address1;
    @JsonProperty("address2")
    public String address2;
    @JsonProperty("city")
    public String city;
    @JsonProperty("province")
    public String province;
    @JsonProperty("country")
    public String country;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("phone")
    public Object phone;
    @JsonProperty("name")
    public String name;
    @JsonProperty("province_code")
    public String provinceCode;
    @JsonProperty("country_code")
    public String countryCode;
    @JsonProperty("country_name")
    public String countryName;
    @JsonProperty("default")
    public Boolean defaultFlag;
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
