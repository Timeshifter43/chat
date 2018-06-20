package com.telegrambot.net;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

public class HttpClient {

    private static final Client CLIENT = ClientBuilder.newClient();


    public static <T> T GET(String url,Class <T> response){
        return CLIENT.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(response);
    }


    public static Response POST(String url,Object data){
        Response res = (Response) CLIENT.target(url)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .post(Entity.entity(data,MediaType.APPLICATION_JSON_TYPE));

        ((javax.ws.rs.core.Response) res).readEntity(Object.class);
        return res;
    }


}
