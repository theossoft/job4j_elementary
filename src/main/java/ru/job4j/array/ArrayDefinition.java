package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Иван Иванов";
        names[1] = "Петр Петров";
        names[2] = "Анатолий Игнатов";
        names[3] = "Сергей Жижов";
    }
}
