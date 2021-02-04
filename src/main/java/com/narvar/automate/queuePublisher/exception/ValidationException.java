/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.exception;

/**
 * Exception thrown if any of the validations fail.
 */
public class ValidationException extends CommerceException {
    private ExceptionCode exceptionCode;

    /**
     * Create a new runtime exception.
     *
     * @param exceptionCode The exception code from {@link ExceptionCode}.
     * @param args          The message arguments.
     */
    public ValidationException(final ExceptionCode exceptionCode, final String... args) {
        super(exceptionCode, args);
        this.exceptionCode = exceptionCode;
    }

    /**
     * Create a new runtime exception.
     *
     * @param exceptionCode The exception code.
     * @param cause         The cause of the exception.
     * @param args          The message arguments.
     */
    public ValidationException(final ExceptionCode exceptionCode, final Throwable cause, final String... args) {
        super(exceptionCode, cause, args);
        this.exceptionCode = exceptionCode;
    }

    @Override
    public String getMessage() {
        return this.exceptionCode.getMessage();
    }
}
