package com.design.pattern.abstractnotification;

public class EmailNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending an email notification");
    }
}
