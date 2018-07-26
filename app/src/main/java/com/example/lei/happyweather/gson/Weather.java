package com.example.lei.happyweather.gson;

import com.google.gson.annotations.SerializedName;
//用于引用其他实体类的总的实体类
import java.util.List;

public class Weather {
    public String status;

    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
