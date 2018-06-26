package net.changwoo.rhplus.paper_flower_android.http;

public class Article {
    private String title;
    private String text;
    private Integer userid;

    public Article(String title, String text, Integer userid) {
        this.title = title;
        this.text = text;
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
