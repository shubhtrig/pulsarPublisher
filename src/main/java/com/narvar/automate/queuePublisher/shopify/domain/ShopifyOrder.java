
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
        "email",
        "closed_at",
        "created_at",
        "updated_at",
        "number",
        "note",
        "token",
        "gateway",
        "test",
        "total_price",
        "subtotal_price",
        "total_weight",
        "total_tax",
        "taxes_included",
        "currency",
        "financial_status",
        "confirmed",
        "total_discounts",
        "total_line_items_price",
        "cart_token",
        "buyer_accepts_marketing",
        "name",
        "referring_site",
        "landing_site",
        "cancelled_at",
        "cancel_reason",
        "total_price_usd",
        "checkout_token",
        "reference",
        "user_id",
        "location_id",
        "source_identifier",
        "source_url",
        "processed_at",
        "device_id",
        "phone",
        "customer_locale",
        "app_id",
        "browser_ip",
        "landing_site_ref",
        "order_number",
        "discount_applications",
        "discount_codes",
        "note_attributes",
        "payment_gateway_names",
        "processing_method",
        "checkout_id",
        "source_name",
        "fulfillment_status",
        "tax_lines",
        "tags",
        "contact_email",
        "order_status_url",
        "presentment_currency",
        "total_line_items_price_set",
        "total_discounts_set",
        "total_shipping_price_set",
        "subtotal_price_set",
        "total_price_set",
        "total_tax_set",
        "total_tip_received",
        "admin_graphql_api_id",
        "line_items",
        "shipping_lines",
        "billing_address",
        "shipping_address",
        "shopifyFulfillments",
        "client_details",
        "refunds",
        "customer"
})
public class ShopifyOrder implements Serializable {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("note")
    private String note;
    @JsonProperty("token")
    private String token;
    @JsonProperty("gateway")
    private String gateway;
    @JsonProperty("test")
    private Boolean test;
    @JsonProperty("total_price")
    private String totalPrice;
    @JsonProperty("subtotal_price")
    private String subtotalPrice;
    @JsonProperty("total_weight")
    private Integer totalWeight;
    @JsonProperty("total_tax")
    private String totalTax;
    @JsonProperty("taxes_included")
    private Boolean taxesIncluded;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("financial_status")
    private String financialStatus;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("total_discounts")
    private String totalDiscounts;
    @JsonProperty("total_line_items_price")
    private String totalLineItemsPrice;
    @JsonProperty("cart_token")
    private String cartToken;
    @JsonProperty("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @JsonProperty("name")
    private String name;
    @JsonProperty("referring_site")
    private String referringSite;
    @JsonProperty("landing_site")
    private String landingSite;
    @JsonProperty("cancelled_at")
    private String cancelledAt;
    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("total_price_usd")
    private String totalPriceUsd;
    @JsonProperty("checkout_token")
    private String checkoutToken;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("location_id")
    private String locationId;
    @JsonProperty("source_identifier")
    private String sourceIdentifier;
    @JsonProperty("source_url")
    private String sourceUrl;
    @JsonProperty("processed_at")
    private String processedAt;
    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("customer_locale")
    private String customerLocale;
    @JsonProperty("app_id")
    private Integer appId;
    @JsonProperty("browser_ip")
    private String browserIp;
    @JsonProperty("landing_site_ref")
    private String landingSiteRef;
    @JsonProperty("order_number")
    private Integer orderNumber;
    @JsonProperty("discount_applications")
    @Valid
    private List<ShopifyDiscountApplication> discountApplications;
    @JsonProperty("discount_codes")
    @Valid
    private List<ShopifyDiscountCode> discountCodes;
    @JsonProperty("note_attributes")
    @Valid
    private List<ShopifyNoteAttributes> noteAttributes;
    @JsonProperty("payment_gateway_names")
    @Valid
    private List<String> paymentGatewayNames;
    @JsonProperty("processing_method")
    private String processingMethod;
    @JsonProperty("checkout_id")
    private Long checkoutId;
    @JsonProperty("source_name")
    private String sourceName;
    @JsonProperty("fulfillment_status")
    private String fulfillmentStatus;
    @JsonProperty("tax_lines")
    @Valid
    private List<ShopifyTaxLine> shopifyTaxLines;
    @JsonProperty("tags")
    private String tags;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("order_status_url")
    private String orderStatusUrl;
    @JsonProperty("presentment_currency")
    private String presentmentCurrency;
    @JsonProperty("total_line_items_price_set")
    @Valid
    private ShopifyTotalLineItemsPriceSet shopifyTotalLineItemsPriceSet;
    @JsonProperty("total_discounts_set")
    @Valid
    private ShopifyTotalDiscountsSet shopifyTotalDiscountsSet;
    @JsonProperty("total_shipping_price_set")
    @Valid
    private ShopifyTotalShippingPriceSet shopifyTotalShippingPriceSet;
    @JsonProperty("subtotal_price_set")
    @Valid
    private ShopifySubtotalPriceSet shopifySubtotalPriceSet;
    @JsonProperty("total_price_set")
    @Valid
    private ShopifyTotalPriceSet shopifyTotalPriceSet;
    @JsonProperty("total_tax_set")
    @Valid
    private ShopifyTotalTaxSet shopifyTotalTaxSet;
    @JsonProperty("total_tip_received")
    private String totalTipReceived;
    @JsonProperty("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @JsonProperty("line_items")
    @Valid
    private List<ShopifyLineItem> shopifyLineItems;
    @JsonProperty("shipping_lines")
    @Valid
    private List<ShopifyShippingLine> shopifyShippingLines;
    @JsonProperty("billing_address")
    @Valid
    private ShopifyBillingAddress shopifyBillingAddress;
    @JsonProperty("shipping_address")
    @Valid
    private ShopifyShippingAddress shopifyShippingAddress;
    @JsonProperty("fulfillments")
    @Valid
    private List<ShopifyFulfillment> shopifyFulfillments;
    @JsonProperty("client_details")
    @Valid
    private ShopifyClientDetails shopifyClientDetails;
    @JsonProperty("refunds")
    @Valid
    private List<ShopifyRefund> refunds;
    @JsonProperty("customer")
    @Valid
    private ShopifyCustomer customer;
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
