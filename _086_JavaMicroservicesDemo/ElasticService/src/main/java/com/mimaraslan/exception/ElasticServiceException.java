package com.mimaraslan.exception;

import lombok.Getter;

@Getter
public class ElasticServiceException extends RuntimeException {

    private final ErrorType type;

    public ElasticServiceException(ErrorType type) {
        super(type.getMessage());
        this.type = type;
    }

    public ElasticServiceException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }

}