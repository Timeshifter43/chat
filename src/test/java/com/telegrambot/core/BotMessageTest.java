package com.telegrambot.core;

import org.junit.Test;

import static org.junit.Assert.*;

public class BotMessageTest {

    @Test
    public void send() {
        new BotMessage(83190119,"Hi there again").send();
    }
}