package ua.javarush.task.task15.task1518;

public class Solution {
    public static Cat cat;

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }

    static {
        Solution.cat = new Cat();
        cat.name = "Пухнастик";
        System.out.println(cat.name);
    }
}
