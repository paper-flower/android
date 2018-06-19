package net.changwoo.rhplus.paper_flower_android.http;

public interface HttpCallback<T> {
    public void success(T t);
    public void fail(T t);
    public void complete(T t);
}
