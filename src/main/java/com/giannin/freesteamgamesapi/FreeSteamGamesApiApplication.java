package com.giannin.freesteamgamesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FreeSteamGamesApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeSteamGamesApiApplication.class, args);
    }

}
