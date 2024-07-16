package ua.javarush.task.pro.task04.task0418;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        
        Scanner sc = new Scanner(System.in);
        boolean isTrue = sc.nextBoolean();
        
        if (isTrue) System.out.println((int) Math.ceil(glass));
        else System.out.println((int) Math.floor(glass));
    }
}