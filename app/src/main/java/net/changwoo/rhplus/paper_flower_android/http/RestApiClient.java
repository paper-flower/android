package net.changwoo.rhplus.paper_flower_android.http;

import retrofit2.Retrofit;

/**
 * Created by rhplus on 19/06/2018.
 */

public abstract class RestApiClient {
    private static String baseUrl;
    protected static Retrofit retrofit;

    private static RestApiClient instance;
    public RestApiClient () {
        baseUrl = "https://api.github.com/";
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
    }
}
