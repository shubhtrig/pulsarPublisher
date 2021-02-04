/*
 * *
 *  * Copyright (c) 2019 Narvar Inc.
 *  * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.shopify.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopifyCachedVariant {

    private Map<Long, Map<String, String>> cacheData;

}
