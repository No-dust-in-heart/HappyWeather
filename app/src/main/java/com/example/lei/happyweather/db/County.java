package com.example.lei.happyweather.db;
import org.litepal.crud.DataSupport;
//litepal数据库的表结构
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;


    public  int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String name){
        this.countyName=name;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }
}