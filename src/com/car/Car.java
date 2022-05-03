package com.car;

public class Car {

    // Поля класса
    private String brand;
    private String color;
    private String type;   // седан хеч сув
    private Transmission transmission;
    private Engine engine;
    private Wheel wheels[];

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public String getColor() {
        return color;
    }

    public void setType(String userType) {
        type = userType;
    }

    public String getType() {
        return type;
    }
}
