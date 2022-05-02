package com.company;

public class Calc {

    // Создаем методы для интов
    static int add(int a, int b) {
        int sum = a + b;
        System.out.println("Сумма интов = " + sum);
        return sum;
    }

    static int sub(int a, int b) {
        int sub = a - b;
        System.out.println("Разница интов = " + sub);
        return sub;
    }

    static int mul(int a, int b) {
        int mul = a * b;
        System.out.println("Произведение интов = " + mul);
        return mul;
    }

    static int div(int a, int b) {
        if (b > 0) {
            int div = a / b;
            System.out.println("Деление интов = " + div);
            System.out.println( );
            return div;
        } else {
            System.out.println("Изучай матчасть, неук: на 0 делить нельзя!!!!!!");
            return b;
        }
    }

    // Создаем перегруженные методы для даблов
    static double add(double a, double b) {
        System.out.println("Перегруженные методы для даблов:");
        double sum = a + b;
        System.out.println("Сумма даблов = " + sum);
        return sum;
    }

    static double sub(double a, double b) {
        double sub = a - b;
        System.out.println("Разница даблов = " + sub);
        return sub;
    }

    static double mul(double a, double b) {
        double mul = a * b;
        System.out.println("Произведение даблов = " + mul);
        return mul;
    }

    static double div(double a, double b) {
        if (b > 0) {
            double div = a / b;
            System.out.println("Деление даблов = " + div);
            return div;
        } else {
            System.out.println("Изучай матчасть, неук: на 0 делить нельзя!!!!!!");
            return b;
        }
    }
}
