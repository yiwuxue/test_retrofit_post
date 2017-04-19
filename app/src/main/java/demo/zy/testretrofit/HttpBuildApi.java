package demo.zy.testretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yizhang210244 on 2017/4/19.
 */

public class HttpBuildApi {
    private static Retrofit mRetrofit;

    public static APIService getApiService(){
        if(mRetrofit == null){
            synchronized (HttpBuildApi.class){
                mRetrofit = new Retrofit.Builder()
                        .baseUrl("https://www.baidu.com/")
                        .client(MyApplication.defaultOkHttpClient())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
        }
        return mRetrofit.create(APIService.class);
    }



}
