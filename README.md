# test_retrofit_post


public interface APIService {
    @GET(" ")
    Call<ResponseBody> test();

    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("https://www.baidu.com/")
    Call<ResponseBody> testPost(@Body RequestBody body);


    @Headers("Content-Type: application/x-www-form-urlencoded")
    @POST("https://www.baidu.com/")
    Call<ResultBean> testPost2(@Body RequestBody body);

}


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