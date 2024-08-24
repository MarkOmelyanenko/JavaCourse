package ua.javarush.task.pro.task04.task0416;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cans = sc.nextInt();
        int people = sc.nextInt();
        
        System.out.println((cans * 1.0) / people);
    }
}