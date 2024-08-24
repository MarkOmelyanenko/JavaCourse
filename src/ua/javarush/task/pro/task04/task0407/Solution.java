package ua.javarush.task.pro.task04.task0407;

public class Solution {
    public static void main(String[] args) {
        
        int sum = 0, number = 0;
        while (number <= 100) {
            if (number % 3 != 0) {
                sum += number;
                number++;
            } else {
                number++;
                continue;
            }
        }
        System.out.println(sum);
    }
}