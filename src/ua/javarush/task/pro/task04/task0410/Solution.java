package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        while (sc.hasNextInt()) {
            int tmp = sc.nextInt();
            if (tmp < firstMin) {
                secondMin = firstMin;
                firstMin = tmp;
            } else if (tmp > firstMin && tmp < secondMin) {
                secondMin = tmp;
            }
        }
        
        System.out.println(secondMin);
    }
}