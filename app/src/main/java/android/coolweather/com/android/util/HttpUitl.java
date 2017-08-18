package android.coolweather.com.android.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Sheaf on 2017/8/17.
 */
//Okhttp的出色封装，这里和服务器进行交互的代码非常简单
public class HttpUitl {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
