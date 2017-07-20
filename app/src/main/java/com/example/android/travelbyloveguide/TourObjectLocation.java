package com.example.android.travelbyloveguide;

/**
 * Created by adama on 14.07.2017.
 */

public class TourObjectLocation {

    private String streetName;
    private int streetNumber;
    private String city;
    private String geoLocalization;

    public TourObjectLocation(String city, String streetName, int streetNumber, String geoLocalization){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
        this.city=city;
        this.geoLocalization=geoLocalization;
    }

    public TourObjectLocation(){
        //empty constructor
    };

    public String getGeoLocalization() {
        return geoLocalization;
    }

    public void setGeoLocalization(String geoLocalization) {
        this.geoLocalization = geoLocalization;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


}
