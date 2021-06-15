package com.protector.carprotector.model;

import java.sql.Time;

public class Limitations {
    Time startTimeOfUse;
    Time endTimeOfUse;
    Coordinates allowedRangeMin;
    Coordinates allowedRangeMax;
    boolean allowedMotion;

    public Limitations(Time startTimeOfUse, Time endTimeOfUse, Coordinates allowedRangeMin, Coordinates allowedRangeMax, boolean allowedMotion) {
        this.startTimeOfUse = startTimeOfUse;
        this.endTimeOfUse = endTimeOfUse;
        this.allowedRangeMin = allowedRangeMin;
        this.allowedRangeMax = allowedRangeMax;
        this.allowedMotion = allowedMotion;
    }

    public void printLimitations () {
        System.out.print("Car limits:\n\nAllowed time of use: " + startTimeOfUse + " to " + endTimeOfUse + "\nAllowed range: " + allowedRangeMin.returnStringCoordinates() + " to " + allowedRangeMax.returnStringCoordinates() + "\nAllowed motion: " + allowedMotion +"\n");
    }
}
