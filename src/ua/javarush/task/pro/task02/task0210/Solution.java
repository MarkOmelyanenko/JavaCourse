package ua.javarush.task.pro.task02.task0210;

public class Solution {

    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount) + 
            Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);
    }
}
