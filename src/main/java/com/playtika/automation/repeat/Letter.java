package com.playtika.automation.repeat;

public class Letter {
    public String sender;
    public String text;

    public boolean isSent;

    public void send(Inbox box, Letter letterToSent) {
        box.mail = letterToSent;
    }
}
