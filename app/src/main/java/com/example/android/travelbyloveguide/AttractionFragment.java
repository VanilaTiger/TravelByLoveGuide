/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.travelbyloveguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionFragment extends Fragment {

    public AttractionFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_object_list_grid, container, false);

        ArrayList<TourObject> tourObjectArrayList = new ArrayList<TourObject>();

        TourObjectLocation location1 = new TourObjectLocation();

        location1.setCity("Cajon Del Maipo");
        location1.setStreetName("mountain");
        //location1.setStreetNumber(54);
        location1.setGeoLocalization("-33417005,-70619383");

        tourObjectArrayList.add(new TourObject(location1, "Day Trip to Cajon Del Maipo", "+1 855 275 5071",
                "Marvel at outdoor landmarks like glaciers, waterfalls, and a scenic river gorge",
                R.drawable.mountain));

        TourObjectLocation location2 = new TourObjectLocation();
        location2.setCity("Santiago de Chile");
        location2.setStreetName("Avenida Presidente Riesco");
        location2.setStreetNumber(5330);
        location2.setGeoLocalization("-33417005,-70619383");

        tourObjectArrayList.add(new TourObject(location2, "Parque Araucano", "29644000",
                "Parque Araucano is in the heart of Las Condes district, one of the richest communes of Santiago",
                R.drawable.parq));

        TourObjectLocation location3 = new TourObjectLocation();
        location3.setCity("Santiago de Chile");
        location3.setStreetName("calle tercera");
        location3.setStreetNumber(74);
        location3.setGeoLocalization("-33417005,-70619383");

        tourObjectArrayList.add(new TourObject(location3, "Attraction 3", "+48519101141", "Great Attraction"));


        //need to set adapter for a list
        TourObjectAdapter adapter = new TourObjectAdapter(getActivity(), tourObjectArrayList, R.color.colorBackgroundTourObject);

        GridView listView = (GridView) rootView.findViewById(R.id.list_grid);

        listView.setAdapter(adapter);

        return rootView;
    }
}
