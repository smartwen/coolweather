package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/9/16.
 * 记录县城 的数据
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;//县的名字
    private String weatherId;//记录县所对应天气的id
    private int cityId;//当前县城所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weeatherId) {
        this.weatherId = weeatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
