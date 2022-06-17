package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double amountOfTransactions() {
        return MathFunction.difference(5.5, 7) + MathFunction.division(2.0, 4);
    }

    public static double calculationAmount() {
        return MathFunction.multiply(4, 8) - MathFunction.sum(3.6, 8.8) - MathFunction.division(9, 4.6) - MathFunction.difference(12.2, 6.0);
    }

    public static void main(String[] args) {
        double res = amountOfTransactions();
        double calc = calculationAmount();
        System.out.println(res);
        System.out.println(calc);
    }
}
