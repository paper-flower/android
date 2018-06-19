package net.changwoo.rhplus.paper_flower_android.http;

public interface ArticleClient {
    public void index(HttpCallback httpCallback);
    public void show(HttpCallback httpCallback, Integer id);
    public void create(HttpCallback httpCallback, Article article);
    public void update(HttpCallback httpCallback, Article article);
    public void detsroy(HttpCallback httpCallback, Integer id);
}
