package net.changwoo.rhplus.paper_flower_android.http;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ArticleService {
    @GET("/api/v1/articles")
    Call<List<Article>> index();

    @GET("/api/v1/articles/{id}")
    Call<Article> show(@Path("id") Integer id);

    @Multipart
    @POST("/api/v1/articles")
    Call<Article> create(@Body Article article);

    @Multipart
    @PUT("/api/v1/articles/{id}")
    Call<Article> update(@Path("id") Integer id, @Body Article article);

    @DELETE("/api/v1/articles/{id}")
    Call<Article> destroy(@Path("id") Integer id);
}
