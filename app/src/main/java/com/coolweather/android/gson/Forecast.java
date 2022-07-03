package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Mercury1973
 * @time 2022/7/3 20:16
 * @desc 天气温度
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
