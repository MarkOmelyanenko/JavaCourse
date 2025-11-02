package ua.javarush.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Петро");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " має заначку у розмірі " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    public static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Hryvnia(2000));
            allMoney.add(new USD(700));
            allMoney.add(new Euro(7000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
