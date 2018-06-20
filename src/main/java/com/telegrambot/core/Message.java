package com.telegrambot.core;

import javax.inject.Inject;
import java.util.Date;

public class Message{
    private int message_id;
    private From from;
    private Chat chat;
    private Date date;
    private String text;


    public int getMessage_id() {
        return message_id;
    }

    public From getFrom() {
        return from;
    }

    public Chat getChat() {
        return chat;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public int getVideosAmount() {
        String amount = text.replaceAll("\\D+","");
        return !amount.isEmpty()? Integer.parseInt(amount) :10;
    }

    public String getStarName() {
        return text.replaceAll("[0-9]","".trim());
    }
}
