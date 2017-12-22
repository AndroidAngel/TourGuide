package com.teamandroidangel.iamangelauditor.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstAttractionFragment extends Fragment {

    public  FirstAttractionFragment () {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        final ArrayList<Attraction> attractions = new ArrayList<>();

        attractions.add(new Attraction("MOUNT KITANGLAD",R.drawable.image3, "Mt. kitanglad is an active volcano.\nLocated in the Kitanglad Mountain Range in Bukidnon province of Mindanao island.\nIt is the fourth highest mountain in the Philippines and has an approximate height of 2,899 meters.", R.drawable.image4, "The name 'KITANGLAD' was derived from a legend that there was once a great flood that submerged the native lands of Bukidnon and only the tip of the mountain,\nthe size of a 'Tanglad'(Lemon Grass), remained visible ('Kita' in Visayan).\nIt is considered as an ancestral domain of several old cultural communities like the Bukidnons, Higaonons and Talaandigs.\nIn 2009, Mount Kitanglad Range Natural Park(MKRNP) was declared as an ASEAN Heritage Park."));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions, R.color.first_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;
    }

}