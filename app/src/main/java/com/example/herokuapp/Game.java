package com.example.herokuapp;

/**
 * Created by James on 2/24/2016.
 */
public class Game {
    /**
     * id : 56cb6bbb0fb67b2e1bf6bced
     * name : Halo 5
     * platform : Xbox One
     * genre : Shooter
     */

    private String id;
    private String name;
    private String platform;
    private String genre;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    //TODO make the game model
    public Game(){}
}
