package com.narvar.automate.queuePublisher.queue.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class RangeDetails {
    private Long endId;
    private Long count;
}
