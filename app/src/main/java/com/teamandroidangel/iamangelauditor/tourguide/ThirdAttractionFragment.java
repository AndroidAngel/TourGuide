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

        attractions.add(new Attraction("BLUE WATER CAVE",R.drawable.image7,"The “Blue Water Cave” is a natural tourist attraction hidden in the lush valley of a river that flows underground in the connecting caverns of the San Jose village.\nIt is located in the Village of San Jose right after a high bridge that marks the boundary of Quezon and Maramag.\nThe trail to the blue waters will lead you to an enormous white rock cliff where rock wall climbers enjoy pulling themselves up to a steep rock surrounded by amazing rock formations. You can reach the blue water cave down to a narrow trail to reach the riverbank of Pulangi River.",R.drawable.image8,"The cave is enchanting and blue waters is magnificent. You can actually swim and be at one with nature.\nBright and turquoise waters that would truly refresh you from a day’s walk – this is definitely a one of a kind adventure that would truly be on top of your bucket list."));
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