package com.telegrambot.service.util;

public class URLUtil {
    public static String replaceWhireSpaces(String url){
        return url.replaceAll("\\s+","%20");
    }

}
