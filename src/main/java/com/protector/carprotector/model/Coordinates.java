package com.protector.carprotector.model;

import java.util.TreeMap;

public class Coordinates {
    TreeMap<String, Double> fullCoordinates = new TreeMap<>();
    private double latitude;
    private double longitude;
    String dirLatitude;
    String dirLongitude;

    public Coordinates(double latitude, String dirLatitude, double longitude, String dirLongitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        fullCoordinates.put(dirLatitude, latitude);
        fullCoordinates.put(dirLongitude, longitude);
        this.dirLatitude = dirLatitude;
        this.dirLongitude = dirLongitude;
    }

    public TreeMap<String, Double> getCoordinates() {
        return fullCoordinates;
    }

    public String returnStringCoordinates() {
        return latitude + dirLatitude + ", " + longitude + dirLongitude;
    }
}
