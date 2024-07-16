package ua.javarush.task.pro.task03.task0304;

import java.util.Scanner;

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        //напишіть тут ваш код
        
        isHigh = (bodyTemperature > 37);
        isLow = (bodyTemperature < 36);
        
        if (isHigh) {
            System.out.println("body temperature is high");
        } else if (isLow){
            System.out.println("body temperature is low");
        } else {
            System.out.println("body temperature is ok");
        }
    }
}
