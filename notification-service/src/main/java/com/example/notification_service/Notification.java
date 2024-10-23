package com.example.notification_service;

public class Notification {

    private int id;
    private String message;
    private boolean read;

    public Notification() {}

    public Notification(int id, String message, boolean read) {
        this.id = id;
        this.message = message;
        this.read = read;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
