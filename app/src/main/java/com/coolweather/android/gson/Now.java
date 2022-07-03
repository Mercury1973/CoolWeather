package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Mercury1973
 * @time 2022/7/3 20:08
 * @desc 温度和天气
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
