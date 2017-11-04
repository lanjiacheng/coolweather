package com.ljc.coolweather.gson;

/**
 * Created by Administrator on 2017/11/4 0004.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
