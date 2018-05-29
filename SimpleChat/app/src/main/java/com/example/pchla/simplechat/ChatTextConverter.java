package com.example.pchla.simplechat;

import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;

public final class ChatTextConverter {

    //Converts chat message into a readable form
    public static SpannableString ConvertChatMessage(ChatMessage m)
    {
        //Convert message to one consolidate string
        String text = m.username + "\n" + m.content;
        //Create custom spannableString in which username is smaller and message itself is bigger
        SpannableString ss1 = new SpannableString(text);
        ss1.setSpan(new RelativeSizeSpan(0.5f),0, m.username.length(),0);
        return ss1;
    }

}
