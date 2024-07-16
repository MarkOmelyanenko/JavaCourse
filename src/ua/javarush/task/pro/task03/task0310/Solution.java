package ua.javarush.task.pro.task03.task0310;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result;
        
        if (number < 5) result = "the number is less than 5";
        else if (number > 5) result = "the number is bigger than 5";
        else result = "the number equals 5";
        
        System.out.println(result);
    }
}
