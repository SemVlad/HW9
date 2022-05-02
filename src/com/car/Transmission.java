package com.car;

public class Transmission {

    // Поля
    private String type;
    private int numOfGears;

    // Методы гет и сет
    public void setType(String typ) {
        type = typ;
    }

    public String getType() {
        return type;
    }

    public void setNumOfGears(int num) {
        numOfGears = num;
    }

    public int getNumOfGears() {
        return numOfGears;
    }
}
