package com.example.lei.happyweather.db;
import org.litepal.crud.DataSupport;
//litepal数据库的表结构
public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public  int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String name){
        this.provinceName=name;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int code){
        this.provinceCode=code;
    }
}