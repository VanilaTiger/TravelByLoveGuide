package com.example.android.travelbyloveguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by adama on 14.07.2017.
 */

public class TourObjectAdapter extends ArrayAdapter<TourObject>{

    public int mBackgroundColor;

    public TourObjectAdapter(Activity context, ArrayList<TourObject> tourObjectArrayList, int mBackgroundColor){

        super(context,0,tourObjectArrayList);
        this.mBackgroundColor=mBackgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_grid, parent,false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        TourObject currentTourObject = getItem(position);

        //Setting all the fields

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.mNameOfTourObject);
        nameTextView.setText((currentTourObject.getmName()));

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.mPhoneNumberOfTourObject);
        phoneTextView.setText((currentTourObject.getmPhoneNumber()));

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.mDescriptOfTourObject);
        descriptionTextView.setText(currentTourObject.getmDescription());
        int color = ContextCompat.getColor(getContext(),mBackgroundColor);
        descriptionTextView.setBackgroundColor(color);

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.mAddressOfTourObject);
        String locationString;
        locationString=currentTourObject.getmTourObjectLocation().getStreetName();
        locationString=locationString+" "+currentTourObject.getmTourObjectLocation().getStreetNumber();
        locationString=locationString+", "+currentTourObject.getmTourObjectLocation().getCity();
        addressTextView.setText(locationString);

        ImageView imageReferenceImageView = (ImageView) listItemView.findViewById(R.id.mImageOfTourObject);
        if (currentTourObject.hasImage()) {
            //Set the ImageView to the image resource specified in the current word
            imageReferenceImageView.setImageResource(currentTourObject.getmImageResourceID());

            //Make sure the image is visible as view are reused by adapter
            imageReferenceImageView.setVisibility(View.VISIBLE);
        } else
            imageReferenceImageView.setVisibility(View.GONE);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        View textContainer = (View) listItemView.findViewById(R.id.textContainer);
        // color used above
        // int color = ContextCompat.getColor(getContext(),mBackgroundColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
