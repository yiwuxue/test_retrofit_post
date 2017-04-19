package demo.zy.testretrofit;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by yizhang210244 on 2017/4/19.
 */

public interface APIService {
    @GET(" ")
    Call<ResponseBody> test();

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("http://cdn.api18tv.com/vodapi.html")
    Call<ResponseBody> testPost(@Body RequestBody body);


    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("http://cdn.api18tv.com/vodapi.html")
    Call<ResultBean> testPost2(@Body RequestBody body);

}
