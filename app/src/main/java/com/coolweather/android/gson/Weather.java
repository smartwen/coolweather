package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/11/3.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    //daily_forecast包含的是一个数组，使用list集合来引用forecastList类
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
