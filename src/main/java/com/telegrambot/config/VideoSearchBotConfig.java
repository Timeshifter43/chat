package com.telegrambot.config;


import org.glassfish.jersey.server.ResourceConfig;

public class VideoSearchBotConfig extends ResourceConfig {

    public VideoSearchBotConfig(){

        register(new DependencyBilder());
        packages(true,"com.telegrambot");
    }


}
