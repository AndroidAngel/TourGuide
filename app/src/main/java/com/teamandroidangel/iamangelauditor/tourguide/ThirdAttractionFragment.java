package com.teamandroidangel.iamangelauditor.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdAttractionFragment extends Fragment {
    public ThirdAttractionFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.third_attraction_title),R.drawable.image7,getString(R.string.third_attraction_string),R.drawable.image8,getString(R.string.third_attraction_second_string)));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(),attractions,R.color.third_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
        return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}