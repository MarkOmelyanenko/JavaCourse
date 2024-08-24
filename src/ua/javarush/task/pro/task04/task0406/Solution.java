package ua.javarush.task.pro.task04.task0406;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String s = sc.nextLine();
            
            if (s.equals("enough")) break;
            else System.out.println(s);
        }
    }
}