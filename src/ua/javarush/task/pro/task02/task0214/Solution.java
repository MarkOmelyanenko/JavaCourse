package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        
        System.out.println(third);
        System.out.println(second.toUpperCase());
        System.out.println(first.toLowerCase());
    }
}
