package com.car;

public class Main {

    public static void main(String[] args) {

        // Силовая установка
        Engine engine = new Engine();
        engine.setEngPower(800);
        engine.setFuel("Diesel");
        engine.setType("V-6");
        engine.setVolume(8.5);
        engine.setNumOfCylinder(12);

        // Трансмиссия авто
        Transmission trans = new Transmission();
        trans.setNumOfGears(6);
        trans.setType("Automatic");

        // массив колес и инициализация массива сеттерами
        Wheel wheels[] = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            Wheel wheel = new Wheel();
            wheel.setBrand("GoodYear");
            wheel.setRadius(20);
            wheel.setHeight(3);
            wheel.setWidth(10);
            wheels[i] = wheel;

            if (i == wheels.length-1) {
                System.out.println("Колеса будут следующие: ");
                System.out.println("Бренд резины - " + wheel.getBrand());
                System.out.println("Высота профиля - " + wheel.getHeight() + " дюймов");
                System.out.println("Ширина профиля - " + wheel.getWidth() + " дюймов");
                System.out.println("Радиус - " + wheel.getRadius() + " дюймов" +'\n');
            }
        }

        // Автомобиль
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("Grey");
        car.setType("SUV");
        car.setEngine(engine);
        car.setTransmission(trans);
        car.setWheels(wheels);

        // вивод на консоль
        System.out.println("Трансмиссия авто: ");
        System.out.println("Коробка на автомобиле - " + trans.getType());
        System.out.println("Количество передач = " + trans.getNumOfGears() + '\n');

        System.out.println("Основные характеристики силовой установки: ");
        System.out.println("Топливо - " + engine.getFuel());
        System.out.println("Тип двигателя - " + engine.getType());
        System.out.println("Оъем двигателя - " + engine.getVolume() + " литров");
        System.out.println("Мощность двигателя - " + engine.getEngPower() + " лошидиных сил");
        System.out.println("Количество цилиндров - " + engine.getNumOfCylinder() + '\n');

        System.out.println("Ваша машина - " + car.getBrand());
        System.out.println("Цвет машины - " + car.getColor());
        System.out.println("Кузов машины - " + car.getType() + "\n");

    }
}
