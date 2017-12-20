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
        attractions.add(new Attraction("SUMALSAG CAVE",R.drawable.image9,"History dictates that Sumalsag Cave belongs to the Municipality of Manolo Fortich.\nA place of excitement for the cavers and spelunkers, Sumalsag Cave is the longest cave in Northern Bukidnon with approximately 1,859 meters from the entrance to its distinct exit where one has to dive underwater to see the outside world after hours of murky and exciting adventure inside the cave.",R.drawable.image10,"The height of the cave varies from one meter to 20 meters and its width varies from less than a meter to a more spacious 9 meters and boasts of its abundance of stalactites and stalagmites.\nIf you’re into an extraordinary adventure, be ready to slide, crawl, swim or even wriggle your body as you move about inside this magnificent Sumalsag Cave."));
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