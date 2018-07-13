package com.example.lei.happyweather.util;

import android.util.Log;

//自定义的Log工具类,当项目完成时将第13行level改为NOTHING即可销毁所有调试日志
public class LogUtil {
    public static final int VERBOSE=1;
    public static final int DEBUG=2;
    public static final int INFO=3;
    public static final int WARN=4;
    public static final int ERROR=5;
    public static final int NOTHING=6;
    public static int level=VERBOSE;

    public static void v(String tag,String msg){
        if(level<=VERBOSE){
            Log.v(tag,msg);
        }
    }
    public static void d(String tag,String msg){
        if(level<=DEBUG){
            Log.d(tag,msg);
        }
    }
    public static void i(String tag,String msg){
        if(level<=INFO){
            Log.i(tag,msg);
        }
    }
    public static void w(String tag,String msg){
        if(level<=WARN){
            Log.w(tag,msg);
        }
    }
    public static void e(String tag,String msg){
        if(level<=ERROR){
            Log.e(tag,msg);
        }
    }
}
