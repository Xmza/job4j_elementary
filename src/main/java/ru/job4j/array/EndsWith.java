package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (word[word.length - 1] == post[post.length - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}
