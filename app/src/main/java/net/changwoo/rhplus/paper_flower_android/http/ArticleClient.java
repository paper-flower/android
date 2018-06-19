package net.changwoo.rhplus.paper_flower_android.http;

public interface ArticleClient {
    public void getArticle(HttpCallback httpCallback);
    public void postArticle();
    public void updateArticle();
}
