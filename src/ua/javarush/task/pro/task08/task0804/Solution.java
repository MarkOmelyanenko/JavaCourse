package ua.javarush.task.pro.task08.task0804;

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        return (int) (Math.random() * 99);
    }
}
