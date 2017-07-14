package com.example.android.travelbyloveguide;

/**
 * Created by adama on 14.07.2017.
 */

public class TourObjectLocation {

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    private String streetName;

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    private int streetNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public String getGeoLocalization() {
        return geoLocalization;
    }

    public void setGeoLocalization(String geoLocalization) {
        this.geoLocalization = geoLocalization;
    }

    private String geoLocalization;

    public TourObjectLocation(String streetName, int streetNumber, String city, String geoLocalization){
        this.streetName=streetName;
        this.streetNumber=streetNumber;
        this.city=city;
        this.geoLocalization=geoLocalization;
    }
}
