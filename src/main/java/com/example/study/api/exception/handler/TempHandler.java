package com.example.study.api.exception.handler;

import com.example.study.api.code.BaseErrorCode;
import com.example.study.api.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
