package ua.javarush.task.pro.task11.task1109;

public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
