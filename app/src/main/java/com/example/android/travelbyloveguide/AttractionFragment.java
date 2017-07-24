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

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Cajon Del Maipo","mountain",1,"-33417005,-70619383"),
                "Day Trip to Cajon Del Maipo", "+1 855 275 5071",
                getString(R.string.attraction_cajon),
                R.drawable.mountain));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile", "Avenida Presidente Riesco",5330,"-33417005,-70619383"),
                "Parque Araucano", "29644000",
                getString(R.string.attraction_parq),
                R.drawable.parq));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation ("Santiago de Chile","Casablanca Valley",1,"-33417005,-70619383"),
                "Casablanca Valley", "+48519101141",
                getString(R.string.attraction_valley),
                R.drawable.valley));

        //need to set adapter for a list
        TourObjectAdapter adapter = new TourObjectAdapter(getActivity(), tourObjectArrayList, R.color.colorBackgroundTourObject);
        GridView listView = (GridView) rootView.findViewById(R.id.list_grid);
        listView.setAdapter(adapter);
        return rootView;
    }
}
