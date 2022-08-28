package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDivisionAndSubtraction(double first, double second) {
        return division(first, second) + subtraction(first, second);
    }

    public static double sumSumMultiplyDivisionSubtraction(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second) + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumDivisionAndSubtraction(10, 20));
        System.out.println("Результат расчета равен: " + sumSumMultiplyDivisionSubtraction(10, 20));
    }
}
