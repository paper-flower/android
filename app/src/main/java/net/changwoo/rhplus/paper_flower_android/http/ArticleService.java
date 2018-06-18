package net.changwoo.rhplus.paper_flower_android.http;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleService {
    @GET("posts")
    Call<List<Article>> listPosts();
}
