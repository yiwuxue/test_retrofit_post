package demo.zy.testretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Call<ResponseBody> responseBodyCall = HttpBuildApi.getApiService().test();

        responseBodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.e("MainActivity", response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });

        String text2 ="data=%257B%2522Action%2522%253A%2522GetAppEdition%2522%252C%2522Message%2522%253A%257B%2522OS%2522%253A2%252C%2522Type%2522%253A1%257D%257D";


        MediaType mediaType = MediaType.parse("text");
        RequestBody requestBody = RequestBody.create(mediaType,text2);
        Call<ResponseBody> responseBodyCall1 = HttpBuildApi.getApiService().testPost(requestBody);

        responseBodyCall1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.e("MainActivity", "post = "+response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });


        MediaType mediaType1 = MediaType.parse("text");
        RequestBody requestBody1 = RequestBody.create(mediaType,text2);

        Call<ResultBean> resultBeanCall = HttpBuildApi.getApiService().testPost2(requestBody1);
        resultBeanCall.enqueue(new Callback<ResultBean>() {
            @Override
            public void onResponse(Call<ResultBean> call, Response<ResultBean> response) {
                ResultBean resultBean = response.body();
                if(resultBean != null){
                    Log.e("MainActivity","resultBean = "+ resultBean.getMessage().getEdition());
                }

            }

            @Override
            public void onFailure(Call<ResultBean> call, Throwable t) {

            }
        });




    }





}
