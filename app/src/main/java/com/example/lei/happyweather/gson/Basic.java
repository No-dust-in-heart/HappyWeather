package com.example.lei.happyweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")//注解让JSON字段和Java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;//JSON字段和Java字段变量名如果相同可以不要注解

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
