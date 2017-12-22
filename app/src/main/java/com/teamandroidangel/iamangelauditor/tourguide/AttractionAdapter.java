package com.teamandroidangel.iamangelauditor.tourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by iamangelauditor on 10/12/2017.
 */

public class AttractionAdapter extends ArrayAdapter {
    private ArrayList<Attraction> dataSet;
    Context mContext;
    private int mColorResource;


    public AttractionAdapter(Context context, ArrayList<Attraction> attractions, int colorResource) {
        super(context,R.layout.list_item,attractions);
        this.dataSet = attractions;
        this.mContext = context;
        mColorResource = colorResource;
    }
    @Nullable
    @Override
    public Attraction getItem(int position) {
        return dataSet.get(position);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }
        Attraction currentAttraction = getItem(position);
        TextView firstView = listItemView.findViewById(R.id.firstTextViewLabel);
        assert currentAttraction != null;
        firstView.setText(currentAttraction.getFirstLabel());

        TextView mainViewLabel = listItemView.findViewById(R.id.mainLabelView);
        mainViewLabel.setText(currentAttraction.getMainLabel());

        TextView secondView = listItemView.findViewById(R.id.secondTextViewLabel);
        secondView.setText(currentAttraction.getSecondLabel());

        ImageView firstImage = listItemView.findViewById(R.id.firstImage);
        if (currentAttraction.hasImage()){
            firstImage.setImageResource(currentAttraction.getFirstImageResource());
            firstImage.setVisibility(View.VISIBLE);
        }else{
            firstImage.setVisibility(View.GONE);
        }

        ImageView secondImage = listItemView.findViewById(R.id.secondImage);
        if (currentAttraction.hasImage()){
            secondImage.setImageResource(currentAttraction.getSecondImageResource());
            secondImage.setVisibility(View.VISIBLE);
        }else{
            secondImage.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        textContainer.setBackgroundColor(color);

        return listItemView;

    }
}
