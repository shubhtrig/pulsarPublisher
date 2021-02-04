package com.narvar.automate.queuePublisher.service;

import com.narvar.automate.queuePublisher.controller.QueueRequest;
import com.narvar.automate.queuePublisher.queue.message.ShopifyOrderMessage;
import com.narvar.automate.queuePublisher.queue.publisher.ShopifyOrderPublisher;
import com.narvar.automate.queuePublisher.shopify.domain.ShopifyLineItem;
import com.narvar.automate.queuePublisher.shopify.domain.ShopifyOrder;
import com.narvar.automate.queuePublisher.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class QueueService {
    @Autowired
    private ShopifyOrderPublisher orderPublisher;

    public void postToQueue(QueueRequest request) {
        try{
            Date startTime = new Date();
            long count = 0;
            while(true) {
                if (DateUtils.findDiffrenceInDays(startTime, new Date()) > 1) {
                    System.out.println("StartTime- " + startTime + "Endtime- " + new Date());
                    break;
                }

                for (int i = 0; i < request.getRepeat(); i++) {
                    ShopifyOrder shopifyOrder = request.getShopifyOrder();
                    modifyShopifyOrder(shopifyOrder, request.getProductIds(), request.getVariantIds());

                    ShopifyOrderMessage orderMessage = new ShopifyOrderMessage();
                    orderMessage.setShopifyOrder(shopifyOrder);
                    orderMessage.setStoreName(request.getStore());
                    orderMessage.setIsPull(true);
                    orderMessage.setJobId(UUID.randomUUID());
                    orderPublisher.publish(orderMessage);
                    System.out.println("Posted Order to Queue- " + shopifyOrder.getId() + ", count- " + (++count));
                }
            }
        } catch (Exception e) {
            System.out.println("exception- "+ e.toString());
        }
    }

    private void modifyShopifyOrder(ShopifyOrder shopifyOrder, List<Long> productIds, List<Long> variantIds) {
        Date createdAt = new Date();
//        shopifyOrder.setCreatedAt(DateUtils.getDateInShopifyFormat(createdAt));
        Random rand = new Random();
        Long orderId = rand.nextLong();
        shopifyOrder.setId(orderId);
        shopifyOrder.setOrderNumber(rand.nextInt(100000));

        if (productIds.size() > 0) {
            int nextNumber = rand.nextInt(productIds.size());
            for (ShopifyLineItem shopifyLineItem : shopifyOrder.getShopifyLineItems()) {
                shopifyLineItem.setProductId(productIds.get(nextNumber));
                shopifyLineItem.setVariantId(variantIds.get(nextNumber));
            }
        }
    }
}
