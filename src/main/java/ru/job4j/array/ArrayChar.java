package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        for (int i = 1; i < word.length; i++) {
            for (int j = 1; j < pref.length; j++) {
                if (word[i] == pref[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
