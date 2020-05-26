package com.giannin.freesteamgamesapi.model;

import com.giannin.freesteamgamesapi.exception.DataFetchException;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SteamDBFreeGamesPage {

    public static List<String> getSteamGameIds(){
        try {
            List<String> returnList = new ArrayList<>();
            Document webpage = Jsoup.connect("https://steamdb.info/upcoming/free/").get();
            Elements tables = webpage.select("table");
            for (Element table: tables) {
                Elements rowsWithApps = table.getElementsByAttribute("data-appid");
                for (Element row: rowsWithApps) {
                    returnList.add(row.attributes().get("data-appid"));
                }
            }
            return returnList;
        }catch (IOException e){
            log.error("Could not fetch the SteamDB page because of the following error: ", e);
            throw new DataFetchException("Fetching data from https://steamdb.info/upcoming/free/ is currently not possible");
        }
    }
}
