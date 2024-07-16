package ua.javarush.task.pro.task03.task0307;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        if (age < 20 || age > 60) System.out.println("you don't have to work");
    }
}
