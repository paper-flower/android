package net.changwoo.rhplus.paper_flower_android.http;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

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
