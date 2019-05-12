package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/11/3.
 * ａｑｉ具体内容 包含当前空气的质量情况
 * 　
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;

    }
}
