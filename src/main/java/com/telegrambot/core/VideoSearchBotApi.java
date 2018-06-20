package com.telegrambot.core;

import com.telegrambot.service.Video;
import com.telegrambot.service.VideoService;

import javax.print.attribute.standard.Media;
import java.util.List;

public class VideoSearchBotApi implements UpdateHandler{


    private VideoService videoService = new VideoService();

    public void onUpdate(Update update) {
        Message mssg = update.getMessage();
        final int chatId = mssg.getChat().getId();
        int videoAmount = mssg.getVideosAmount();
        String star = mssg.getStarName();


        List<Video> videos = videoService.getTopRatedVideo(star,videoAmount);
        if(!videos.isEmpty()){
            videos.forEach(v->new BotVideoMessage(chatId,v).send());
        }else{
            new BotTextMessage(chatId,"No videos found for star: " + star).send();

        }


    }
}
