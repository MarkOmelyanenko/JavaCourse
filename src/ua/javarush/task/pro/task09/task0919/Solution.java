package ua.javarush.task.pro.task09.task0919;

public class Solution {
    public static void main(String[] args) {
        String string = "Їхав мопед задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {

        return new StringBuilder(string).reverse().toString();
    }
}
