package com.protector.carprotector.model;

import java.time.Month;
import java.sql.Time;

public class CarSystem{


    public static void main(String args[]) {
        Generators draw = new Generators();
        draw.addLocation();

        int whichLocation = draw.generateInt(0,11);
        Location myCarLocation = new Location(draw.getKey(whichLocation), draw.getValue(whichLocation));

        StateOfCar state = new StateOfCar(myCarLocation, false, draw.generateDate(2021, Month.JUNE, 01, 2021, Month.JUNE, 11), draw.generateTime(), true);

        Limitations limits = new Limitations(new Time(28800000), new Time(79200000), new Coordinates(51.65, "N", 19.4, "E"), new Coordinates(51.9, "N", 19.6, "E"), false);

        Car myToyota = new Car("Toyota CH-R", 2018, "Hybrid", "EL-345WR", draw.generateDate(2021, Month.SEPTEMBER, 01, 2022, Month.DECEMBER, 31), state, limits);

        myToyota.printInfo();
    }
}
