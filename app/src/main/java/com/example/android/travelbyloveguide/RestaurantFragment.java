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

public class RestaurantFragment extends Fragment {

    public RestaurantFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_object_list_grid, container, false);
        ArrayList<TourObject> tourObjectArrayList= new ArrayList<TourObject>();

        ///Items add to the list
        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Barrio Bellavista Constitucion",136,"-33417005,-70619383"),
                "Peumayen Ancestral Food", "no phone number",
                getString(R.string.restaurant_peumayen),
                R.drawable.peumayen));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Av Presidente Kennedy",5741,"-33417005,-70619383"),
                "Latin Grill", "56-2-4262303",
                getString(R.string.restaurant_latingrill),
                R.drawable.latingrill));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Av. Cardenal Jose Maria Caro",390,"-33417005,-70619383"),
                "Castillo Forestal", "+56 2 2664 1544",
                getString(R.string.restaurant_castillo),
                R.drawable.castillo));

        //need to set adapter for a list
        TourObjectAdapter adapter = new TourObjectAdapter(getActivity(), tourObjectArrayList,R.color.colorBackgroundTourObject);
        GridView listView = (GridView) rootView.findViewById(R.id.list_grid);
        listView.setAdapter(adapter);
        return rootView;
    }
}
