/*
 *
 * Copyright (c) 2019 Narvar Inc.
 * All rights reserved
 *
 */

package com.narvar.automate.queuePublisher.exception;

/**
 * This generic exception thrown by Commerce service for different scenarios.
 */
public class CommerceException extends Exception {

    private static final long serialVersionUID = 1L;
    private final ExceptionCode exceptionCode;
    private final String[] args;

    /**
     * Create a new runtime exception.
     *
     * @param exceptionCode The exception code from {@link ExceptionCode}.
     * @param args          The message arguments.
     */
    public CommerceException(final ExceptionCode exceptionCode, final String... args) {
        super(exceptionCode.getCode());
        this.exceptionCode = exceptionCode;
        this.args = args;
    }

    /**
     * Create a new runtime exception.
     *
     * @param exceptionCode The exception code.
     * @param cause         The cause of the exception.
     * @param args          The message arguments.
     */
    public CommerceException(final ExceptionCode exceptionCode, final Throwable cause, final String... args) {
        super(exceptionCode.getCode(), cause);
        this.exceptionCode = exceptionCode;
        this.args = args;
    }

    public String getExceptionCode() {
        return this.exceptionCode.getCode();
    }

    @Override
    public String getMessage() {
        return this.exceptionCode.getMessage();
    }

}