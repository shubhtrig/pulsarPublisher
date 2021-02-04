package com.narvar.automate.queuePublisher.controller;

import com.narvar.automate.queuePublisher.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class QueueRequestController {
    private QueueService service;

    @Autowired
    public QueueRequestController(QueueService service) {
        this.service = service;
    }

    @PostMapping(value = "/queue", consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void handlePostRequest(@RequestBody QueueRequest request) {
        System.out.println("Received request for- " + request.toString());
        service.postToQueue(request);
    }

    @PostMapping(value = "/queue/range", consumes = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void handleRangePostRequest(@RequestBody QueueRequest request) {
        System.out.println("Received request for- " + request.toString());
        service.postToQueue(request);
    }
}
