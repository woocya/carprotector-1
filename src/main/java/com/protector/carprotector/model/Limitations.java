package com.protector.carprotector.model;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
public class Limitations {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    LocalTime startTimeOfUse;
    LocalTime endTimeOfUse;
    @OneToOne(cascade = CascadeType.ALL)
    Coordinates allowedRangeMin;
    @OneToOne(cascade = CascadeType.ALL)
    Coordinates allowedRangeMax;
    boolean allowedMotion;

    public Limitations() {}

    public Limitations(LocalTime startTimeOfUse, LocalTime endTimeOfUse, Coordinates allowedRangeMin, Coordinates allowedRangeMax, boolean allowedMotion) {
        this.startTimeOfUse = startTimeOfUse;
        this.endTimeOfUse = endTimeOfUse;
        this.allowedRangeMin = allowedRangeMin;
        this.allowedRangeMax = allowedRangeMax;
        this.allowedMotion = allowedMotion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getStartTimeOfUse() {
        return startTimeOfUse;
    }

    public void setStartTimeOfUse(LocalTime startTimeOfUse) {
        this.startTimeOfUse = startTimeOfUse;
    }

    public LocalTime getEndTimeOfUse() {
        return endTimeOfUse;
    }

    public void setEndTimeOfUse(LocalTime endTimeOfUse) {
        this.endTimeOfUse = endTimeOfUse;
    }

    public Coordinates getAllowedRangeMin() {
        return allowedRangeMin;
    }

    public void setAllowedRangeMin(Coordinates allowedRangeMin) {
        this.allowedRangeMin = allowedRangeMin;
    }

    public Coordinates getAllowedRangeMax() {
        return allowedRangeMax;
    }

    public void setAllowedRangeMax(Coordinates allowedRangeMax) {
        this.allowedRangeMax = allowedRangeMax;
    }

    public boolean isAllowedMotion() {
        //if (allowedMotion == false) return "no motion detected";
        //else return "motion detected";
        return allowedMotion;
    }

    public void setAllowedMotion(boolean allowedMotion) {
        this.allowedMotion = allowedMotion;
    }

    public void printLimitations () {
        System.out.print("Car limits:\n\nAllowed time of use: " + startTimeOfUse + " to " + endTimeOfUse + "\nAllowed range: " + allowedRangeMin.returnStringCoordinates() + " to " + allowedRangeMax.returnStringCoordinates() + "\nAllowed motion: " + allowedMotion +"\n");
    }
}
