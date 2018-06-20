package com.telegrambot.service;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VideoService {

    private HubService HubService;

    public VideoService() {
        HubService = new HubService();
    }

    public List<Video> getTopRatedVideo(String star,int amount){
        List<Video> allVideos = HubService.getVideoForStar(star);
        if(allVideos.isEmpty()){
            VideoSorter sorter = new VideoSorter();
            List<Video> sorted = sorter.sortByRatings(allVideos);

            List<Video> topRated = new ArrayList<>(amount);

            ListIterator<Video> itr = sorted.listIterator(sorted.size());
            int counter = 0;
            while (itr.hasPrevious()&& counter < amount){
                topRated.add(itr.previous());
            }
            return topRated;
        }
        return allVideos;
    }
}
