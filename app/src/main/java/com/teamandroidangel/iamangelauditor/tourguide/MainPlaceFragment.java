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

            attractions.add(new Attraction("THE PROVINCE OF BUKIDNON",R.drawable.image1,"The name 'Bukidnon' means 'Highlander' or 'Mountain Dweller'.\nIt is well endowed with natural scenic spots.\nIts a vast land area possesses diverse tourist spots, both natural and manmade.\nBukidnon is best visited not only during summer season but all year round.\nWhether you are an outdoorsy person or just a mere vacationist.\nIts a landlocked province in the philippines located in the Northern Mindanao region.",R.drawable.image2,"The province is considered to be the food basket of Mindanao, being the major producer of rice and corn in the region.\nProducts from plantations in the province also include pineapples,bananas and sugarcane.\nIt is known as the watershed of Mindanao.It is endowed with six major river systems namely: Pulangi,\nTagoloan, Cagayan, Manupali, Muleta and Bobonawan Rivers\nThese rivers carved the landscape of the province creating numerous canyons. The province is inhabited by 1,415,226 residents."));

            AttractionAdapter attractionAdapter = new AttractionAdapter(getActivity(), attractions, R.color.main_color);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(attractionAdapter);

            return rootView;
        }
    }
