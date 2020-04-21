package com.example.demo.controller.io;

public class GetElementsRequest {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GetElementsRequest{" +
                "type='" + type + '\'' +
                '}';
    }
}
