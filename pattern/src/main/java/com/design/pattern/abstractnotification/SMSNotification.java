package com.design.pattern.abstractnotification;

public class SMSNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification");
    }
}
