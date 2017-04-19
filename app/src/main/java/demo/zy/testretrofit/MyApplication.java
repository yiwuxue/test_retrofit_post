package demo.zy.testretrofit;

import android.app.Application;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by yizhang210244 on 2017/4/19.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static OkHttpClient defaultOkHttpClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.writeTimeout(30*1000, TimeUnit.MILLISECONDS);
        builder.readTimeout(20*1000,TimeUnit.MILLISECONDS);
        builder.connectTimeout(15*1000,TimeUnit.MILLISECONDS);
        return builder.build();
    }

}
