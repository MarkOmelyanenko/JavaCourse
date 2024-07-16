package ua.javarush.task.pro.task03.task0301;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String cold = "it's cold outside";
        String warm = "на warm тепло";

        Scanner sc = new Scanner(System.in);
        int degree = sc.nextInt();
        
        if (degree < 0) System.out.println(cold);
        else System.out.println(warm);
    }
}
