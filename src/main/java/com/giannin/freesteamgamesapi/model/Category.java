package com.giannin.freesteamgamesapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    private Integer id;
    private String description;
}
