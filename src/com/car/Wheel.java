package com.car;

public class Wheel {

    // Поля класса
    private String brand;
    private int radius;
    private int width;
    private int height;

    // геттеры и сеттеры
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // основной метод
    // создания массива колес
    public static void main(String[] args) {

        Wheel wheel = new Wheel();// объект класса для доступа к геттерам

        int wheels[] = new int[3]; // массив колес и инициализация массива геттерами
        wheels[0] = wheel.getHeight();
        wheels[1] = wheel.getRadius();
        wheels[2] = wheel.getWidth();

    }
}

