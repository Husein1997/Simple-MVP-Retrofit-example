package com.example.jean.retrofitexample.service;

import com.example.jean.retrofitexample.model.History;
import com.example.jean.retrofitexample.model.Player;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * This class represents the Countries API, all endpoints can stay here.
 *
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 09/03/18.
 * Jesus loves you.
 */
public interface FootballApi {

    @GET("player")
    Call<Player> getPlayer();

    @GET("history")
    Call<History> getHistory();

//    @GET("country/get/iso2code/{alpha2_code}")
//    Call<Data> getByAlpha2Code(@Path("alpha2_code") String alpha2Code);
}
