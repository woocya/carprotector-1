package com.protector.carprotector.model;

import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Generators {
    Map<Coordinates, String> place = new HashMap<>();

    public void addLocation() {
        place.put(new Coordinates(51.734, "N", 19.484, "E"), "Kolowa, Lodz");
        place.put(new Coordinates(51.81, "N", 19.39, "E"), "Sw. Teresy, Lodz");
        place.put(new Coordinates(51.872, "N", 19.469, "E"), "Smardzewska, Lagiewniki Nowe");
        place.put(new Coordinates(51.713, "N",19.388, "E"), "Poludniowa, Lodz");
        place.put(new Coordinates(51.7289, "N",19.5144, "E"), "Lodowa, Lodz");
        place.put(new Coordinates(51.7911, "N",19.5144, "E"), "Stokowska, Lodz");
        place.put(new Coordinates(51.7167, "N",19.6457, "E"), "Wrzosowa, Kraszew");
        place.put(new Coordinates(51.74, "N",19.824, "E"), "11 Listopada, Koluszki");
        place.put(new Coordinates(51.115, "N",17.056, "E"), "Grunwaldzka, Wroclaw");
        place.put(new Coordinates(50.016, "N",22.002, "E"), "Kwiatkowskiego, Rzeszow");
        place.put(new Coordinates(51.244, "N",22.5235, "E"), "Wilenska, Lublin");
        place.put(new Coordinates(54.35, "N",18.63, "E"), "Kartuska, Gdansk");
    }

    public Coordinates getKey(int index) {
        if (index > place.size()) {
            return null;
        }

        Iterator<Map.Entry<Coordinates, String>> iterator = place.entrySet().iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            Map.Entry<Coordinates, String> entry = iterator.next();
            if (counter == index) {
                return entry.getKey();
            }
            counter++;
        }
        return null;
    }

    public String getValue(int index) {
        if (index > place.size()) {
            return null;
        }

        Iterator<Map.Entry<Coordinates, String>> iterator = place.entrySet().iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            Map.Entry<Coordinates, String> entry = iterator.next();
            if (counter == index) {
                return entry.getValue();
            }
            counter++;
        }
        return null;
    }

    public Time generateTime() {
        final Random random = new Random();
        final int millisInDay = 24*60*60*1000;
        return new Time((long)random.nextInt(millisInDay));
    }

    public LocalDate generateDate(int startYear, Month startMonth, int startDay, int endYear, Month endMonth, int endDay) {
        //wyjatki!!!!
        LocalDate start = LocalDate.of(startYear, startMonth, startDay);
        LocalDate end = LocalDate.of(endYear, endMonth,endDay);
        return RandomDates.between(start, end);
    }

    public int generateInt(int min, int max) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }
}
