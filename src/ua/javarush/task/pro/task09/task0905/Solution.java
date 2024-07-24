package ua.javarush.task.pro.task09.task0905;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber < 0) {
            return 0;
        } else {
            int i = 0, octalNumber = 0;
            while (decimalNumber != 0) {
                octalNumber += decimalNumber % 8 * Math.pow(10, i);
                decimalNumber /= 8;
                i++;
            }
            return octalNumber;
        }
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber < 0) {
            return 0;
        } else {
            int i = 0, decimalNumber = 0;
            while (octalNumber != 0) {
                decimalNumber += octalNumber % 10 * Math.pow(8, i);
                octalNumber /= 10;
                i++;
            }
            return decimalNumber;
        }
    }
}
