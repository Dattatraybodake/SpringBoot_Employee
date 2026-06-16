package com.example.Employee_Management.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

    String message;

    LocalDateTime timeStamp;

    String path;

    String responseCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public ErrorDetails() {
    }

    public ErrorDetails(String message, LocalDateTime timeStamp, String path, String responseCode) {
        this.message = message;
        this.timeStamp = timeStamp;
        this.path = path;
        this.responseCode = responseCode;
    }
}
