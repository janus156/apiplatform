package com.platform.project.exception;

import com.platform.project.common.ErrorCode;

public class BusinessException extends RuntimeException {

    private final int code;

    public BusinessException(int code) {
        this.code=code;
    }

    public BusinessException(ErrorCode code, String message) {
        super(message);
        this.code=code.getCode();
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
