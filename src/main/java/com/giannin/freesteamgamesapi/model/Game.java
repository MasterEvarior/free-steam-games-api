package com.giannin.freesteamgamesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Game {
    @Id
    private Integer steamId;
    private String name;
    private Integer requiredAge;
    private String shortDescription;
    private String thumbnail;
    private String website;
    private String releaseDate;
    @OneToMany
    private List<Genre> genres;
    @OneToMany
    private List<Category> categories;
}
