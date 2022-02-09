package com.twilio;


// Twilio Helper Library
import com.twilio.Twilio;

// Twilio Object
import com.twilio.rest.api.v2010.account.Message;

// Message Object
import com.twilio.type.PhoneNumber;

public class Messages {

    public static final String Account_SID = "AC89eeb06b612e96dd52cf99f6dace3482";
    public static final String AUTH_TOKEN = "aa260ce52e1b6e7d148914ab019a2fd4";

    public static void main(String[] args) {
    Twilio.init(Account_SID, AUTH_TOKEN);
    Message message = Message.creator(
            new PhoneNumber("+918657476630"),
            new PhoneNumber("+19377875716"),
            "Hello How are you I'm using java"
    ).create();
        System.out.println(message.getSid());

    }
}
