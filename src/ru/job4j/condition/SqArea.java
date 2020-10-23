package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        // p - периметр треугольника p = 2 * (L + h); где L - длина, h - высота
        // k - коэффициент
        // h = p / (2 * (k + 1));
        // L = h * k;
        // s = L * h;

        double h = p / (2 * (k + 1));
        double L = h * k;
        double rsl = L * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}