package ua.javarush.task.pro.task03.task0302;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", report to the military enlistment office";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        
        if (age >= 18 && age <= 26) System.out.println(name + militaryCommissar);
    }
}
