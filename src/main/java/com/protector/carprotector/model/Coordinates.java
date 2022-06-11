package com.protector.carprotector.model;

import javax.persistence.*;
import java.util.TreeMap;

@Entity
public class Coordinates {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    TreeMap<String, Double> fullCoordinates = new TreeMap<>();
    private double latitude;
    private double longitude;
    String dirLatitude;
    String dirLongitude;

    public Coordinates() {
    }

    public Coordinates(double latitude, String dirLatitude, double longitude, String dirLongitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        fullCoordinates.put(dirLatitude, latitude);
        fullCoordinates.put(dirLongitude, longitude);
        this.dirLatitude = dirLatitude;
        this.dirLongitude = dirLongitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TreeMap<String, Double> getFullCoordinates() {
        return fullCoordinates;
    }

    public void setFullCoordinates(TreeMap<String, Double> fullCoordinates) {
        this.fullCoordinates = fullCoordinates;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDirLatitude() {
        return dirLatitude;
    }

    public void setDirLatitude(String dirLatitude) {
        this.dirLatitude = dirLatitude;
    }

    public String getDirLongitude() {
        return dirLongitude;
    }

    public void setDirLongitude(String dirLongitude) {
        this.dirLongitude = dirLongitude;
    }

    public TreeMap<String, Double> getCoordinates() {
        return fullCoordinates;
    }

    public String returnStringCoordinates() {
        return latitude + dirLatitude + ", " + longitude + dirLongitude;
    }
}
