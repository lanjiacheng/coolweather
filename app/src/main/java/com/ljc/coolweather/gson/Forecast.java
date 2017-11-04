package com.ljc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/4 0004.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature = new Temperature();
    @SerializedName("cond")
    public More more = new More();
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
