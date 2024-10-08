package ua.javarush.task.pro.task09.task0907;

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNumber = "";

        if (decimalNumber <= 0) return hexNumber;

        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static int toDecimal(String hexNumber) {
        int decimalNumber = 0;

        if (hexNumber == null) return decimalNumber;

        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = decimalNumber * 16 + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }
}
