package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/9/16.
 * 功能:和服务器进行交互的
 */

public class HttpUtil {
    //发起一条ＨＴＴＰ请求　
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        //构造Request对象
       Request request = new Request.Builder().url(address).build();
       //通过Call#enqueue(Callback)方法来提交异步请求
       client.newCall(request).enqueue(callback);
    }

}
