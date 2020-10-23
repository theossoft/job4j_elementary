package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2-x1;
        double y = y2-y1;
        double xPow = Math.pow(x,2);
        double yPow = Math.pow(y,2);
        double xy = xPow + yPow;
        double rsl = Math.sqrt(xy);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(10, 5, 3, 20);
        System.out.println("result (10, 5) to (3, 20) " + result2);
        double result3 = Point.distance(3, 3, 7, 8);
        System.out.println("result (3, 3) to (7, 8) " + result3);
    }
}