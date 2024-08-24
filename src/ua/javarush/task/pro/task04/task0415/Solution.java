package ua.javarush.task.pro.task04.task0415;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        
        System.out.println((int) (3.14 * radius * radius));
    }
}