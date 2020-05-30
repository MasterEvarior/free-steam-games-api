package com.giannin.freesteamgamesapi.service;

import com.giannin.freesteamgamesapi.model.Game;
import com.giannin.freesteamgamesapi.model.SteamAPI;
import com.giannin.freesteamgamesapi.model.SteamDBFreeGamesPage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class WebScraperService {

    @Scheduled(fixedRate = 10000) //TODO make more configurable
    public void updateDatabase(){
        log.info("Starting to update database via web scraper");
        List<String> gameIds = SteamDBFreeGamesPage.getSteamGameIds();
        for (String id: gameIds) {
            try {
                Game game = new Game(id);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
