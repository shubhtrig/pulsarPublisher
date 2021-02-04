
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
        "first_name",
        "address1",
        "phone",
        "city",
        "zip",
        "province",
        "country",
        "last_name",
        "address2",
        "company",
        "latitude",
        "longitude",
        "name",
        "country_code",
        "province_code"
})
public class ShopifyBillingAddress implements Serializable {

    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("address1")
    public String address1;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("city")
    public String city;
    @JsonProperty("zip")
    public String zip;
    @JsonProperty("province")
    public String province;
    @JsonProperty("country")
    public String country;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("address2")
    public String address2;
    @JsonProperty("company")
    public String company;
    @JsonProperty("latitude")
    public Double latitude;
    @JsonProperty("longitude")
    public Double longitude;
    @JsonProperty("name")
    public String name;
    @JsonProperty("country_code")
    public String countryCode;
    @JsonProperty("province_code")
    public String provinceCode;
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
