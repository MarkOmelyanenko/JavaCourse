package ua.javarush.task.pro.task08.task0814;

public class Solution {

    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
