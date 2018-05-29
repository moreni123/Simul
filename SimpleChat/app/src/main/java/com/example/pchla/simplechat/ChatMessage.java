package com.example.pchla.simplechat;

public class ChatMessage {

    public String username;
    public String content;

    public ChatMessage(String username, String content)
    {
        this.username = username;
        this.content = content;
    }


    //Basic constructor method required for correct Firebase data conversions DO NOT DELETE
    public ChatMessage()
    {

    }

}
