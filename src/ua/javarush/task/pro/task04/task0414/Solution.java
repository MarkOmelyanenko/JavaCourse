package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int number = sc.nextInt();
        do {
            System.out.println(s);
            number--;
        } while (number > 0 && number < 4);
    }
}