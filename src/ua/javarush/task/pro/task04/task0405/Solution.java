package ua.javarush.task.pro.task04.task0405;

public class Solution {
    public static void main(String[] args) {
        int height = 0;
        while (height < 10) {
            int width = 0;
            while (width < 20) {
                if (height == 0 || height == 9) {
                    System.out.print('B');
                } else if (width == 0 || width == 19) {
                    System.out.print('B');
                } else System.out.print(' ');
                
                width++;
            }
            System.out.println();
            height++;
        }
    }
}