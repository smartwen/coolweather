package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/9/16.
 * 功能:和服务器进行交互的
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
       Request request = new Request.Builder().url(address).build();
       client.newCall(request).enqueue(callback);
    }

}
