package com.telegrambot.core;

public abstract class BotMessage {

    protected static final String TELEGRAM_RESOURCE = "https://api.telegram.org/bot547669314:AAE3a1dStx6Z8OZvJFC3I77vE-NI40RPU7g";

    private final int chat_id;


    public BotMessage(int chat_id){
        this.chat_id = chat_id;

    }



    public int getChat_id() {

        return chat_id;
    }

    abstract void send();


}
