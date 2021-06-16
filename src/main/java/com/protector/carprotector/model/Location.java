package com.protector.carprotector.model;

import java.util.Random;

public class Location {
    private Coordinates coordinates;
    private String street;

    public Location(Coordinates coordinates, String street) {
        this.coordinates = coordinates;
        this.street = street;
    }

    public String returnStringLocation() {
        return coordinates.returnStringCoordinates() + " ul. " + street;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    /*public void generateLocation(double minLatitude, double maxLatitude, double minLongitude, double maxLongitude) {
        Random r = new Random();
        latitude = minLatitude + (maxLatitude - minLatitude) * r.nextDouble();
        longitude = minLongitude + (maxLongitude - minLongitude) * r.nextDouble();
    }*/

}
