package com.giannin.freesteamgamesapi.model;

import com.giannin.freesteamgamesapi.exception.DataFetchException;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.IOException;

@Slf4j
public class SteamAPI {

    public static JSONObject getGameAsJson(String id){
        try {
            String url = String.format("https://store.steampowered.com/api/appdetails/?appids=%s&cc=EE&l=english&v=1", id);
            String apiAnswer =  Jsoup.connect(url).ignoreContentType(true).get().body().text();
            JSONObject json = new JSONObject(apiAnswer);
            if(json.getJSONObject(id).getBoolean("success")) {
                return json;
            }else {
                String message = String.format("Request for the id '%s' could not be fulfilled the API returned a 'no-success'-message.", id);
                log.error(message);
                throw new DataFetchException(message);
            }
        }catch (IOException | JSONException e){
            String message = String.format("Could not retrieve info of the game with the id '%s' because of the following error:", e);
            log.error(message);
            throw new DataFetchException("Fetching data from the Steam API is currently not possible");
        }
    }
}
