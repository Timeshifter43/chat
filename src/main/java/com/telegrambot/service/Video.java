package com.telegrambot.service;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

public class Video {

    private String duration;
    private String views;
    private String video_id;
    private String rating;

    public String getDuration() {
        return duration;
    }

    public String getViews() {
        return views;
    }

    public String getVideo_id() {
        return video_id;
    }

    public String getRating() {
        return rating;
    }

    public int getRatings() {
        return ratings;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDefault_thumb() {
        return default_thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public String getPublish_date() {
        return publish_date;
    }

    private int ratings;
    private String title;
    private String url;
    private String default_thumb;
    private String thumb;
    private String publish_date;
    @JsonIgnore
    private List<Object> thumbs;
    @JsonIgnore
    private List<Object> tags;
    @JsonIgnore
    private List<Object> pornstars;


}