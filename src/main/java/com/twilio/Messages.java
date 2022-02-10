package com.twilio;


// Twilio Helper Library
import com.twilio.Twilio;

// Twilio Object
import com.twilio.rest.api.v2010.account.Message;

// Message Object
import com.twilio.type.PhoneNumber;

public class Messages {

    public static final String Account_SID = "AC89xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    public static final String AUTH_TOKEN = "aa260xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";

    public static void main(String[] args) {
    Twilio.init(Account_SID, AUTH_TOKEN);
    Message message = Message.creator(
            new PhoneNumber("+91xxxxxxxxxx"),
            new PhoneNumber("+1xxxxxxxxx"),
            "Hello How are you I'm using java"
    ).create();
        System.out.println(message.getSid());

    }
}
