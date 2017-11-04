package com.ljc.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/11/2 0002.
 */

/*
网络工具类，用于网络通信
 */
public class HttpUtil {
    /*
    发送请求方法，需要传入两参数，地址和回调对象（用来处理服务器响应），
    当发出请求并收到回复时，就会回调该对象的方法
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
