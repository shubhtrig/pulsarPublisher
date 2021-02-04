/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.exception;

/**
 * Enum to hold message codes and their respective message.
 */
public enum ExceptionCode {
    GENERIC_ERROR("COMMERCE-100", "Processing error."),
    DATA_NOT_FOUND("COMMERCE-101", "Data not found."),
    CREDENTIALS_NOT_FOUND("COMMERCE-102", "Credentials not found."),
    STORE_NAME_EMPTY("COMMERCE-103", "StoreName not found."),
    INVALID_REQUEST("COMMERCE-104", "Invalid request."),
    ORDER_PROCESSING_FAILURE("COMMERCE-105", "Order processing failed."),
    RANGE_PROCESSING_FAILURE("COMMERCE-106", "Range processing failed."),
    INCORRECT_JOB("COMMERCE-107", "Job not found in DB."),
    RANGE_PUBLISHING_FAILURE("COMMERCE-108", "Error publishing Range message."),
    DB_OPERATION_ERROR("COMMERCE-109", "Error while performing DB operation."),
    INCORRECT_JOB_STATUS("COMMERCE-110", "Incorrect Job status found."),
    UNSUPPORTED_TYPE("COMMERCE-111", "Unsupported type found."),
    INVALID_STORE_NAME("COMMERCE-112", "Invalid Store Name."),
    INVALID_FIRST_LAST_ID("COMMERCE-113", "Invalid Request, First Id should be less than Last Id."),
    DUPLICATE_JOB("COMMERCE-114", "Job already exists"),
    INVALID_TIME("COMMERCE-115", "Invalid Request, Start time should be less than End time."),
    INTERNAL_ERROR("COMMERCE-116", "Internal Server Error."),
    PUBLISHER_ERROR("COMMERCE-117", "Unable to publish to Queue."),
    INVALID_JOB_ID("COMMERCE-118", "Job Id given in path is invalid"),
    PRODUCT_PROCESSING_FAILURE("COMMERCE-119", "Product processing failed."),
    MULTIPLE_RECORDS_FOUND("COMMERCE-120", "Multiple Records Found."),
    RATE_LIMITED("COMMERCE-121", "Rate limit error."),
    INVALID_RANGE("COMMERCE-122", "Invalid Request, Start time to End time difference should be less than 60 days."),
    INVALID_CREDENTIALS("COMMERCE-123", "Invalid Credentials Error.");

    private final String code;
    private final String message;

    ExceptionCode(final String code, final String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Human readable code.
     *
     * @return displayable code.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message string to load.
     *
     * @return message.
     */
    public String getMessage() {
        return this.message;
    }

}
