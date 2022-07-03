package com.coolweather.android.gson;

/**
 * @author Mercury1973
 * @time 2022/7/3 20:06
 * @desc 空气质量
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}
