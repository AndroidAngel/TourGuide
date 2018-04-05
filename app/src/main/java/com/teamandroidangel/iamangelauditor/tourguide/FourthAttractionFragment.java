package com.teamandroidangel.iamangelauditor.tourguide;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourthAttractionFragment extends Fragment {
    public FourthAttractionFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);

        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.fourth_attraction_title),R.drawable.image9,getString(R.string.fourth_attraction_string),R.drawable.image10,getString(R.string.fourth_attraction_second_string)));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(),attractions,R.color.fourth_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
    return rootView;
    }
    @Override
    public void onStop() {
        super.onStop();
    }
}