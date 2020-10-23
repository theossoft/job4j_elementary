package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " bucks.");

        // Test euro
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        // Test dollar
        int inD = 140;
        int expectedD = 2;
        int outD = Converter.rubleToDollar(inD);
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles are 2. Test result : " + passedD);
    }
}