package br.edu.ifpb.padroes;

import java.io.File;

public class SmsNotificationListener implements EventListener {

    private String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("SMS to " + phoneNumber + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

}
