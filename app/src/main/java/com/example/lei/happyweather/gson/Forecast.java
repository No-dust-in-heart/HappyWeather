package com.example.lei.happyweather.gson;

import com.google.gson.annotations.SerializedName;
//针对JSON数据中包含一个数组的情况,只需定义出单个数据的实体类即可
public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
