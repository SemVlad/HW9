package com.company;

public class Test {

    public static void main(String[] args) {

        // Проверяем перегрузку методов
        {
            // методы интов
            int add = Calc.add(1, 2);
            int sub = Calc.sub(3, 2);
            int mul = Calc.mul(2, 2);
            int div = Calc.div(4, 1);
        }
        {
            // перегруженные методы для даблов
            double add = Calc.add(1.0, 2.0);
            double sub = Calc.sub(3.0, 2.0);
            double mul = Calc.mul(2.0, 2.0);
            double div = Calc.div(4.0, 0.0);
        }
    }
}
