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
import android.widget.ListView;

import java.util.ArrayList;

public class HostelFragment extends Fragment {

    public HostelFragment(){
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_object_list, container, false);
        ArrayList<TourObject> tourObjectArrayList = new ArrayList<TourObject>();
        ///Items add to the list
        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Monjitas",506,"-33417005,-70619383"),
                "Andes Hostel", getString(R.string.nophonenumber),
                getString(R.string.hostel_andes),
                R.drawable.andes));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Manuel Thompson",3940,"-33417005,-70619383"),
                "Hotel Dacarlo", "+56 2 2422 0088",
                getString(R.string.hostel_dacarlo),
                R.drawable.dacarlo));

        tourObjectArrayList.add(new TourObject(
                new TourObjectLocation("Santiago de Chile","Pio Nono",193,"-33417005,-70619383"),
                "Hotel Monteverde", getString(R.string.nophonenumber),
                getString(R.string.hostel_monteverde),
                R.drawable.monteverde));

        //need to set adapter for a list

        TourObjectAdapter adapter = new TourObjectAdapter(getActivity(), tourObjectArrayList, R.color.colorBackgroundTourObject);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
