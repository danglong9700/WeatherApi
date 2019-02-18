package com.example.vinicorp.api;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class WeatherObject {
    @SerializedName("coord")
    public Coord coord;
    @SerializedName("sys")
    public Sys sys;
    @SerializedName("weather")
    public ArrayList<Weather> weather = new ArrayList<Weather>();
    @SerializedName("main")
    public Main main;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("cloud")
    public Cloud cloud;
    @SerializedName("dt")
    public float dt;
    @SerializedName("id")
    public int id;
    @SerializedName("name")
    public String name;
    @SerializedName("cod")
    public float cod;
    @SerializedName("visibility")
    public float visibility;
    @SerializedName("base")
    public String base;

    class Coord{
        @SerializedName("lon")
        public float lon;
        @SerializedName("lat")
        public float lat;
    }

    class Weather{
        @SerializedName("id")
        public int id;
        @SerializedName("main")
        public String main;
        @SerializedName("description")
        public String description;
        @SerializedName("icon")
        public String icon;
    }

    class Sys{
        @SerializedName("type")
        public int type;
        @SerializedName("id")
        public int id;
        @SerializedName("message")
        public float message;
        @SerializedName("country")
        public String country;
        @SerializedName("sunrise")
        public String sunrise;
        @SerializedName("sunset")
        public String sunset;

    }
    class Main{
        @SerializedName("temp")
        public float temp;
        @SerializedName("humidity")
        public float humidity;
        @SerializedName("pressure")
        public float pressure;
        @SerializedName("temp_min")
        public float temp_min;
        @SerializedName("temp_max")
        public float temp_max;
    }
    class Wind{
        @SerializedName("wind")
        public float wind;
        @SerializedName("deg")
        public float deg;

    }
    class Cloud{
        @SerializedName("all")
        public float all;
    }

}
