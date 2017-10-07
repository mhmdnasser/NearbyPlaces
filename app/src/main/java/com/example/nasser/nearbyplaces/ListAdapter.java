package com.example.nasser.nearbyplaces;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ListAdapter extends ArrayAdapter<SearchDetails> {

    public ListAdapter(@NonNull Context context,  @NonNull SearchDetails[] objects) {
        super(context, 0, objects);
    }
//    public MovieAdapter(@NonNull Context context, @NonNull MovieDataModel[] objects)
//    {
//        super(context, 0, objects);
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row , parent , false);
        }
        SearchDetails searchDetails = getItem(position);
        ImageView imageViewListView = (ImageView)convertView.findViewById(R.id.imageViewPoster);
        //Picasso.with(getContext()).load(movieModel.getPoster_path()).into(imageViewListView);
        TextView textViewMovieNameListView =(TextView)convertView.findViewById(R.id.texRatting);
        TextView textViewMovieOverViewListView=(TextView)convertView.findViewById(R.id.texRatting);
        //  textViewMovieOverViewListView.setText(movieModel.getOverview());
        textViewMovieNameListView.setText(searchDetails.getName());
        return convertView;
    }
}
