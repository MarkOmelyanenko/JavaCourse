package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrows = scanner.nextInt();
        multiArray = new int[arrows][];

        if (arrows > 0) {
            for (int i = 0; i < arrows; i++) {
                int columns = scanner.nextInt();
                if (columns > 0) {
                    multiArray[i] = new int[columns];
                }
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("[] ");
            }
            System.out.println();
        }
    }
}
