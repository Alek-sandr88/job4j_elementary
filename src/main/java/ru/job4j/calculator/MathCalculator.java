package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double amountOfTransactions(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double calculationAmount(double first, double second) {
        return multiply(first, second) + sum(first, second) + division(first, second) + difference(first, second);
    }

    public static void main(String[] args) {
        double res = amountOfTransactions(3.6, 5.0);
        double calc = calculationAmount(4.5, 8.0);
        System.out.println(res);
        System.out.println(calc);
    }
}
