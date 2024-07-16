package ua.javarush.task.pro.task05.task0505;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;

        if (n < 0) {
            return;
        } else {
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (n % 2 == 0) {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
