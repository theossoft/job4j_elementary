package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i : numbers) {
            System.out.println(i);
        }
    }
}