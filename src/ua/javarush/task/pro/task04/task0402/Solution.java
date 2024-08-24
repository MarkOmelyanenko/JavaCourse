package ua.javarush.task.pro.task04.task0402;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String text = " любить мене.";
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        
        int i = 0;
        while (i < 10) {
            System.out.println(in + text);
            i++;
        }
    }
}
