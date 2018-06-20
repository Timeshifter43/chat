package com.telegrambot.net;

import com.telegrambot.core.BotMessage;
import org.junit.Test;

import static org.junit.Assert.*;

public class HttpClientTest {

    @Test
    public void POST() {
        HttpClient.POST(
                "https://api.telegram.org/bot547669314:AAE3a1dStx6Z8OZvJFC3I77vE-NI40RPU7g/sendMessage",
                new BotMessage(83190119,"Hi there"));
    }
}