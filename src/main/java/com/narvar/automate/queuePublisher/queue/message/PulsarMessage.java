/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.queue.message;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

/**
 * Generic Message structure for all Pulsar Messages.
 */
@Data
@ToString
public class PulsarMessage implements Serializable {

    private static final long serialVersionUID = 4083934010829159897L;
    private UUID jobId;
    private String storeName;

    public PulsarMessage() {
    }
}
