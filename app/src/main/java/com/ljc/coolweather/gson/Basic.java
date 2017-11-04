package com.ljc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/4 0004.
 */

/*
具体内容如下：
"basic":{
    "city":"苏州"
    "id":"CN101190401"
    "update":{
        "loc":"2016-08-08 21:58"
    }
}
映射成的类，如下：
 */
public class Basic {
    @SerializedName("city")         //如果不想直接用JSON中的数据来做变量名，那么可以添加一个这样的
                                    //包含JSON中的原名的注解来做一个映射
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
