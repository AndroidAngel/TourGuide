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
public class SecondAttractionFragment extends Fragment {


    public SecondAttractionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list,container,false);
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("DAHILAYAN FOREST PARK",R.drawable.image5,"A tourist destination that offers an array of fun activities for the whole family, and for all ages.\nAsia’s Longest Dual Zipline, Skytower Base Jump ride 8 storey platform this is the highest parajump in the Philippines using a cell site tower.\nRiders experience a split second free fall followed by a gradual descent , ending in a soft landing in less than 10 seconds. and many more..",R.drawable.image6,"Since its opening in September 2009, Zipzone has been visited to over a thousand enthusiasts, including a courageous 2 year old and a 77 year old grandpa.\nLocated at Barangay Dahilayan, Manolo Fortich Bukidnon, Dahilayan Forest Park is nestled at the foot of Mount Kitanglad 4,700 ft. above sea level."));
        AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions, R.color.second_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

        return rootView;

    }
    @Override
    public void onStop() {
        super.onStop();


    }

}