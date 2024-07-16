package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.equals(b)) System.out.println("the strings are the same");
        else System.out.println("the lines are not the same");
    }
}
