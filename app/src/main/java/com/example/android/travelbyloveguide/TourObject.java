package com.example.android.travelbyloveguide;

/**
 * Created by adama on 14.07.2017.
 */

public class TourObject {
    private TourObjectLocation mTourObjectLocation;
    private String mName;
    private String mPhoneNumber;
    private String mDescription;
    private int mImageResourceID=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED =-1;

    public TourObject ( TourObjectLocation mTourObjectLocation, String mName, String mPhoneNumber, String mDescription, int mImageResourceID){
        this.mTourObjectLocation=mTourObjectLocation;
        this.mName=mName;
        this.mPhoneNumber=mPhoneNumber;
        this.mDescription=mDescription;
        this.mImageResourceID=mImageResourceID;
    }

    public TourObject ( TourObjectLocation mTourObjectLocation, String mName, String mPhoneNumber, String mDescription){
        this.mTourObjectLocation=mTourObjectLocation;
        this.mName=mName;
        this.mPhoneNumber=mPhoneNumber;
        this.mDescription=mDescription;
    }

    public TourObjectLocation getmTourObjectLocation() {
        return mTourObjectLocation;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() { return  mImageResourceID!=NO_IMAGE_PROVIDED; }
}
