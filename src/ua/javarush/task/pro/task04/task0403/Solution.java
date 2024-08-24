package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                sum += number;
            } else if (sc.hasNextLine()) {
                String in = sc.nextLine();
                isExit = in.equals("ENTER");
            }
        }
        
        System.out.println(sum);

    }
}