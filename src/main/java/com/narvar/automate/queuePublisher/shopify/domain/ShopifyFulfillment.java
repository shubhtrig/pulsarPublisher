/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author benjamin.liu@narvar.com
 */
@Data
@ToString(exclude = {"trackingNumbers", "trackingUrls", "shopifyLineItems"})
@EqualsAndHashCode(exclude = {"trackingNumbers", "trackingUrls", "shopifyLineItems"})
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "order_id",
        "status",
        "created_at",
        "service",
        "updated_at",
        "tracking_company",
        "shipment_status",
        "location_id",
        "tracking_number",
        "tracking_numbers",
        "tracking_url",
        "tracking_urls",
        "receipt",
        "line_items"
})
public class ShopifyFulfillment implements Serializable {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("order_id")
    private Long orderId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("service")
    private String service;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("tracking_company")
    private String trackingCompany;
    @JsonProperty("shipment_status")
    private String shipmentStatus;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("tracking_number")
    private String trackingNumber;
    @JsonProperty("tracking_numbers")
    private List<String> trackingNumbers = null;
    @JsonProperty("tracking_url")
    private String trackingUrl;
    @JsonProperty("tracking_urls")
    private List<String> trackingUrls = null;
    @JsonProperty("receipt")
    private Receipt receipt;
    @JsonProperty("line_items")
    private List<ShopifyLineItem> shopifyLineItems = null;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({"testcase", "authorization"})
    public static class Receipt implements Serializable {
        @JsonProperty("testcase")
        private Boolean testcase;
        @JsonProperty("authorization")
        private String authorization;

        public Receipt() {
        }

        public Receipt(Boolean testcase, String authorization) {
            this.testcase = testcase;
            this.authorization = authorization;
        }
    }
}