package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        /* loops */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int temp = array[i][j];
                if (temp < 0) array[i][j] = 0;
            }
        }
        return array;
    }
}