package com.hemisferiod.apirest.shared.response;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ResponseModel {

    private Timestamp timestamp;
    private Object data;
    private int responseCode;
    private String status;

    public ResponseModel(Timestamp timestamp, Object data, int responseCode, String status) {
        this.timestamp = timestamp;
        this.data = data;
        this.responseCode = responseCode;
        this.status = status;
    }
}
