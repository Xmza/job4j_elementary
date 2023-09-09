package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int right, double left, int up) {
        int result = left > right + up ? (int) left : right + up;
        return result;
    }

    public static int max(int right, int left, double up, double down) {
        int result = left + right > up + down ? left + right : (int) (up + down);
        return result;
    }
}
