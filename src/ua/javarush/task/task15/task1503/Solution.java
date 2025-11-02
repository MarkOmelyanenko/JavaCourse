package ua.javarush.task.task15.task1503;

public class Solution {
    public static void main(String[] args) {
        new LuxuriousCar().printlnDesire();
        new CheapCar().printlnDesire();
        new Ferrari().printlnDesire();
        new Lanos().printlnDesire();
    }

    public static class LuxuriousCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        private void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Ferrari extends LuxuriousCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу їздити на ";
        public static String LUXURIOUS_CAR = "розкішному авто";
        public static String CHEAP_CAR = "дешевому авто";
        public static String FERRARI_NAME = "Феррарі";
        public static String LANOS_NAME = "Ланосі";
    }
}
