package ru.job4j.calculator;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + dollar + " dollar.");

        float inEuro = 140;
        float inDollar = 180;
        float expectedEuro = 2;
        float expectedDollar = 3;
        float outEuro = Converter.rubleToEuro(inEuro);
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("180 rubles are 3. Test result : " + passedDollar);
    }
}
