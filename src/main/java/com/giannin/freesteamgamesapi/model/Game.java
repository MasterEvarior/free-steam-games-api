package com.giannin.freesteamgamesapi.model;

import lombok.*;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @Setter(AccessLevel.NONE)
    private Integer steamId;
    private String name;
    private Integer requiredAge;
    private String shortDescription;
    private String thumbnail;
    private String website;
    private String releaseDate;
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Genre> genres;
    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Category> categories;

    public Game(String steamId) throws JSONException {
        JSONObject data = SteamAPI.getGameAsJson(steamId).getJSONObject(steamId).getJSONObject("data");
        this.steamId = data.getInt("steam_appid");
        this.name = data.getString("name");
        this.requiredAge = data.getInt("required_age");
        this.shortDescription = data.getString("short_description");
        this.thumbnail = data.getString("header_image");
        this.website = data.getString("website");
        this.releaseDate = data.getJSONObject("release_date").getString("date");
        JSONArray genresData = data.getJSONArray("genres");
        this.genres = createGenres(genresData);
        JSONArray categoriesData = data.getJSONArray("categories");
        this.categories = createCategories(categoriesData);
    }


    private List<Category> createCategories(JSONArray categoriesArray) throws JSONException {
        List<Category> list = new ArrayList<>();
        for(int i = 0; i < categoriesArray.length(); i++){
            Integer id = categoriesArray.getJSONObject(i).getInt("id");
            String description = categoriesArray.getJSONObject(i).getString("description");
            list.add(new Category(id, description));
        }
        return list;
    }

    private List<Genre> createGenres(JSONArray genreArray) throws JSONException {
        List<Genre> list = new ArrayList<>();
        for(int i = 0; i < genreArray.length(); i++){
            Integer id = genreArray.getJSONObject(i).getInt("id");
            String description = genreArray.getJSONObject(i).getString("description");
            list.add(new Genre(id, description));
        }
        return list;
    }
}
