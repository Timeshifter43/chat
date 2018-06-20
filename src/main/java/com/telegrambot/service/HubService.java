package com.telegrambot.service;

import com.telegrambot.net.HttpClient;
import com.telegrambot.service.util.URLUtil;

import java.util.ArrayList;
import java.util.List;

public class HubService {

    private static final String HUB_RESOURCE = "http://www.pornhub.com/webmasters/search?";

    public List<Video> getVideoForStar(String star){
        String url = URLUtil.replaceWhireSpaces(HUB_RESOURCE + "stars[]=" + star);
        HubResponse res = HttpClient.GET(url,HubResponse.class);
        if(res.getVideos()!=null){
                return res.getVideos();

    }

    return new ArrayList<Video>(0);
    }
}
