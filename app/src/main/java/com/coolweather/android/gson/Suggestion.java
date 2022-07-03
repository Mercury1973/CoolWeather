package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Mercury1973
 * @time 2022/7/3 20:10
 * @desc 该天气下出行等建议
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;
    }

    public class CarWash{

        @SerializedName("txt")
        public String info;
    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
