package net.changwoo.rhplus.paper_flower_android;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import net.changwoo.rhplus.paper_flower_android.http.Article;
import net.changwoo.rhplus.paper_flower_android.http.ArticleClient;
import net.changwoo.rhplus.paper_flower_android.http.ArticleClientImpl;
import net.changwoo.rhplus.paper_flower_android.http.HttpCallback;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HttpCallback<List<Article>> {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ArticleClient articleClient = new ArticleClientImpl();
        articleClient.index(this);
    }

    private void buildListView(List<Article> articles){
        ListView listView=(ListView)findViewById(R.id.listview);
        ListviewAdapter adapter=new ListviewAdapter(this, R.layout.item, articles);
        listView.setAdapter(adapter);
    }

    @Override
    public void success(List<Article> articles) {
        buildListView(articles);
    }

    @Override
    public void fail(List<Article> articles) {

    }

    @Override
    public void complete(List<Article> articles) {

    }
}
