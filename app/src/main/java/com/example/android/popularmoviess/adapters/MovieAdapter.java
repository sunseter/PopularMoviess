package com.example.android.popularmoviess.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.android.popularmoviess.R;
import com.example.android.popularmoviess.models.Movie;
import com.example.android.popularmoviess.utils.TmdbJsonUtils;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by yubaarrami on 12/9/17.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {

    Context context;
    public MovieAdapter(Activity context, List<Movie> movies) {
        super(context,0,movies);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Movie movie = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_movie, parent, false);
        }

        ImageView posterImage = (ImageView) convertView.findViewById(R.id.image_poster);
        Picasso.with(context)
                .load()
                .into(posterImage);

        return convertView;
    }
}
