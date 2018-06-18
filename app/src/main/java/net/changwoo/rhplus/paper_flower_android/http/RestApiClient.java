package net.changwoo.rhplus.paper_flower_android.http;

/**
 * Created by rhplus on 19/06/2018.
 */

public class RestApiClient {
    private static String baseUrl;
//    private static Retrofit retrofit;

    private static RestApiClient instance;
    private RestApiClient () {}

    public static RestApiClient getInstance () {
        if ( instance == null ){
            instance = new RestApiClient();
            baseUrl = "https://api.github.com/";
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(baseUrl)
//                    .build();

        }
        return instance;
    }


}
