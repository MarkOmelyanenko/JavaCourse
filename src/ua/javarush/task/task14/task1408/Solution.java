package ua.javarush.task.task14.task1408;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.FRANCE);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            switch (country) {
                case Country.FRANCE:
                    hen = new FrenchHen();
                    break;
                case Country.POLAND:
                    hen = new PolishHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
            }

            return hen;
        }
    }
}
