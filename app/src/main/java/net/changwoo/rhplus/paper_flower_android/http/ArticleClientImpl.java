package net.changwoo.rhplus.paper_flower_android.http;

import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleClientImpl extends RestApiClient implements ArticleClient {

    ArticleService service;

    public ArticleClientImpl(){
        this.service = retrofit.create(ArticleService.class);
    }

    @Override
    public void index(final HttpCallback httpCallback) {
        /** Call the method with parameter in the interface to get the notice data*/
        Call<List<Article>> call = service.index();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<List<Article>>() {
            @Override
            public void onResponse(Call<List<Article>> call, Response<List<Article>> response) {
                List<Article> articles = response.body();
                httpCallback.success(null);
                httpCallback.complete(null);
            }

            @Override
            public void onFailure(Call<List<Article>> call, Throwable t) {
                httpCallback.fail(null);
                httpCallback.complete(null);
            }
        });
    }

    @Override
    public void create() {

    }

    @Override
    public void update() {

    }
}
