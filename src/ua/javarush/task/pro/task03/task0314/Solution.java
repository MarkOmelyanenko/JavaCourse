package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        
        if (in.equalsIgnoreCase(secret)) System.out.println("доступ дозволено");
        else System.out.println("доступ заборонено");
    }
}
