package com.example.lei.happyweather.db;
import org.litepal.crud.DataSupport;
//litepal数据库的表结构
public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public  int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String name){
        this.cityName=name;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int code){
        this.cityCode=code;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}