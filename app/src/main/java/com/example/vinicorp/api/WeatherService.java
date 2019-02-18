package com.example.vinicorp.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("data/2.5/weather?")
    Call<WeatherObject> getCurrentWeatherData(@Query("lat") String lat, @Query("lon") String lon, @Query("APPID") String appid);
}
