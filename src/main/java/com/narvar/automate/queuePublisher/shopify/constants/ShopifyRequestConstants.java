/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.constants;

public class ShopifyRequestConstants {
    public static final String UPDATED_AT_MIN = "updated_at_min";
    public static final String STATUS = "status";
    public static final String ANY = "any";
    public static final String PAGE = "page";
    public static final String LIMIT = "limit";
    public static final String COUNT = "count";
    public static final String IDS = "ids";
    public static final String SORT_ORDER = "order";
    public static final String CREATED_AT_MIN = "created_at_min";
    public static final String CREATED_AT_MAX = "created_at_max";
    public static final String SINCE_ID = "since_id";
    public static final String CREATED_AT = "created_at";

    private ShopifyRequestConstants() {

    }

    public enum SortOrderKey {
        CREATED_AT("created_at");

        private SortOrderKey(String key) {
        }
    }

    public enum SortOrder {
        ASC("asc"), DESC("desc");

        private SortOrder(String order) {
        }
    }

    public enum CreatedAt {
        CREATED_AT_MIN("created_at_min"),
        CREATED_AT_MAX("created_at_max");

        private CreatedAt(String createdAt) {

        }
    }

    public enum Status {
        OPEN("open"),
        CLOSED("closed"),
        CANCELLED("cancelled"),
        ANY("any");
        private final String status;

        Status(final String status) {
            this.status = status;
        }

        public String getStatus() {
            return this.status;
        }
    }
}