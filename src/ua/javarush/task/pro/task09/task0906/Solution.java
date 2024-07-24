package ua.javarush.task.pro.task09.task0906;

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNumber = "";
        if (decimalNumber < 0) return binaryNumber;
        else {
            while (decimalNumber != 0) {
//                binaryNumber += decimalNumber % 2;
//                decimalNumber /= 2;
                binaryNumber = decimalNumber % 2 + binaryNumber;
                decimalNumber = decimalNumber / 2;
            }
            return binaryNumber;
        }
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null) {
            return 0;
        } else {
            int decimalNumber = 0;
            for (int i = 0; i < binaryNumber.length(); i++) {
                decimalNumber += Character.getNumericValue(binaryNumber.charAt(binaryNumber.length() - 1 - i)) * Math.pow(2, i);
            }
            return decimalNumber;
        }
    }
}
