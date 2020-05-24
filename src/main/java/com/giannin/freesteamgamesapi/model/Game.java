package com.giannin.freesteamgamesapi.model;

import java.util.List;

public class Game {
    private Integer steamId;
    private String name;
    private Integer requiredAge;
    private String shortDescription;
    private String thumbnail;
    private String website;
    private List<Genre> genres;
    private List<Category> categories;
    private ReleaseDate releaseDate;
}
