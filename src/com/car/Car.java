package com.car;

public class Car {

    // Поля класса
    private String brand;
    private String color;
    private String type;   // седан хеч сув

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

    // основной метод
    public static void main(String[] args) {

        // Автомобиль
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Grey");
        car.setType("SUV");

        System.out.println("Ваша машина - " + car.getBrand());
        System.out.println("Цвет машины - " + car.getColor());
        System.out.println("Кузов машины - " + car.getType() + "\n");

        // Силовая установка
        Engine engine = new Engine();
        engine.setEngPower(800);
        engine.setFuel("Diesel");
        engine.setType("V-6");
        engine.setVolume(8.5);
        engine.setNumOfCylinder(12);

        System.out.println("Основные характеристики силовой установки: ");
        System.out.println("Топливо - " + engine.getFuel());
        System.out.println("Тип двигателя - " + engine.getType());
        System.out.println("Оъем двигателя - " + engine.getVolume() + " литров");
        System.out.println("Мощность двигателя - " + engine.getEngPower() + " лошидиных сил");
        System.out.println("Количество цилиндров - " + engine.getNumOfCylinder() + '\n');

        // Трансмиссия авто
        Transmission trans = new Transmission();
        trans.setNumOfGears(6);
        trans.setType("Automatic");

        System.out.println("Трансмиссия авто: ");
        System.out.println("Коробка на автомобиле - " + trans.getType());
        System.out.println("Количество передач = " + trans.getNumOfGears() + '\n');

        // Колеса
        Wheel wheel = new Wheel();
        wheel.setBrand("GoodYear");
        wheel.setRadius(20);
        wheel.setHeight(3);
        wheel.setWidth(10);

        System.out.println("Колеса будут следующие: ");
        System.out.println("Бренд резины - " + wheel.getBrand());
        System.out.println("Высота профиля - " + wheel.getHeight() + " дюймов");
        System.out.println("Ширина профиля - " + wheel.getWidth() + " дюймов");
        System.out.println("Радиус - " + wheel.getRadius() + " дюймов");

    }
}
