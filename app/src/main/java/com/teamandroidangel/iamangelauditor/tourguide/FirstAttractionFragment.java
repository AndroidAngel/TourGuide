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
public class FirstAttractionFragment extends Fragment {

    public FirstAttractionFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction(getString(R.string.first_attraction_title), R.drawable.image3, getString(R.string.first_attraction_string), R.drawable.image4, getString(R.string.first_attraction_second_string)));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions, R.color.first_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}