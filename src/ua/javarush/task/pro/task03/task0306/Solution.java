package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if ((a < b + c) && (b < a + c) && (c < a + b)) System.out.println(TRIANGLE_EXISTS);
        else System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
