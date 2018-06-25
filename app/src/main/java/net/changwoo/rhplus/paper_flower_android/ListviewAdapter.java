package net.changwoo.rhplus.paper_flower_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import net.changwoo.rhplus.paper_flower_android.http.Article;

import java.util.List;

/**
 * Created by rhee on 18/06/2018.
 */

public class ListviewAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Article> articles;
    private int layout;

    public ListviewAdapter(Context context, int layout, List<Article> articles) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.articles = articles;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return articles.size();
    }

    @Override
    public String getItem(int position) {
        return articles.get(position).getText();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }
        Article article = articles.get(position);
        ImageView icon = (ImageView) convertView.findViewById(R.id.imageview);
        icon.setImageResource(R.drawable.dog);
        TextView name = (TextView) convertView.findViewById(R.id.textview);
        name.setText(article.getText());
        return convertView;
    }
}
