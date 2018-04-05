package com.teamandroidangel.iamangelauditor.tourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v4.app.Fragment;


import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainPlaceFragment extends Fragment {

    public MainPlaceFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(getString(R.string.main_attraction_title), R.drawable.image1, getString(R.string.main_attraction_string), R.drawable.image2, getString(R.string.main_attraction_second_string)));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions, R.color.main_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);
        return rootView;
    }
}
