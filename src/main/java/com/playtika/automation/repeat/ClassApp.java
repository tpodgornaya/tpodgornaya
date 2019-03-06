package com.playtika.automation.repeat;

public class ClassApp {
    public static void main(String[] args) {
        Letter l1 = new Letter();
        l1.isSent = false;
        l1.sender = "Tatiana";
        l1.text = "Call me";

        Inbox myInbox = new Inbox();

        l1.send(myInbox, l1);

        myInbox.printText();



    }
}
