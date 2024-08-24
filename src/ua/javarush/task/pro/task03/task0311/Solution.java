package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        if (Math.abs(b - a) < 0.000001) System.out.println("числа рівні");
        else System.out.println("числа не рівні");
        
    }
}
