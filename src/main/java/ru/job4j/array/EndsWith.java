package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] == post[post.length - i - 1]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
