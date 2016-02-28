package com.example.herokuapp;

/**
 * Created by James on 2/24/2016.
 */
public class Game {
    /**
     * _id : 56cb6bbb0fb67b2e1bf6bced
     * name : Halo 5
     * platform : Xbox One
     * genre : Shooter
     */

    private String _id;
    private String name;
    private String platform;
    private String genre;

    public void setId(String id) {
        this._id = id;
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
        return _id;
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
    public void Game(){}
    public void Game(String id, String name, String genre, String platform){
        this._id = id;
        this.name = name;
        this.genre = genre;
        this.platform = platform;
    }
}
