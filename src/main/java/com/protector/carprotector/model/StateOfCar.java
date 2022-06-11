package com.protector.carprotector.model;

// @Entity
public class StateOfCar {
/*    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;*/

    Location location;
    Engine engine;

    public StateOfCar() {
    }

    public StateOfCar(Location location, Engine engine) {
        this.location = location;
        this.engine = engine;
    }
/*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void printInfo() {
        System.out.print("State info:\n\nLocation: " + location.returnStringLocation() + "\n\n");
    }
}
