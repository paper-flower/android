package net.changwoo.rhplus.paper_flower_android.http;

public interface HttpCallback {
    public <T>void success(T o);
    public <T>void fail(T o);
    public <T>void complete(T o);
}
