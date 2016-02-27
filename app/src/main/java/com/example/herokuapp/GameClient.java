package com.example.herokuapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by James on 2/26/2016.
 */
public interface GameClient {
    //TODO set up the retrofit http call interface
    @GET("/api/games")
    Call<List<Game>> getGames();

    @POST("/login")
    Call<Game> basicLogin();
}
