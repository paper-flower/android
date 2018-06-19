package net.changwoo.rhplus.paper_flower_android.http;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ArticleService {
    @GET("posts")
    Call<List<Article>> listPosts();
    @POST("posts")
    Call<Article> createNotice(@Body Article article);
}
