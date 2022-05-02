package com.car;

public class Engine {

    // Поля
    private int numOfCylinder;
    private double volume;
    private int engPower;   //  в лошадиных силах
    private String fuel;  // дизель, бенз, гибрид..
    private String type; // v-образный, оппозитный, рядный

    // Методы гет и сет
    public void setNumOfCylinder(int num) {
        numOfCylinder = num;
    }

    public int getNumOfCylinder() {
        return numOfCylinder;
    }

    public void setVolume(double vol) {
        volume = vol;
    }

    public double getVolume() {
        return volume;
    }

    public void setEngPower(int pow) {
        engPower = pow;
    }

    public int getEngPower() {
        return engPower;
    }

    public void setFuel(String palivo) {
        fuel = palivo;
    }

    public String getFuel() {
        return fuel;
    }

    public void setType(String typ) {
        type = typ;
    }

    public String getType() {
        return type;
    }
}
