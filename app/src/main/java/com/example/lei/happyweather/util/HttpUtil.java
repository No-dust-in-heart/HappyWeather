package com.example.lei.happyweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
//用于发送网络请求的工具,只需传入地址和注册一个回调即可
//获取天气信息和省市县数据
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
