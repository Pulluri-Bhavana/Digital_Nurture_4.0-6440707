package com.example4.mock;

public class MessageService {
    private Notifier notifier;

    public MessageService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sendMessage(String msg) {
        notifier.send(msg);  // This is the void method
    }
}
