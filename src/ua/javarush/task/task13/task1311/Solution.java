package ua.javarush.task.task13.task1311;

public class Solution {
    public static void main(String[] args) throws Exception {
        EnglishTranslator englishTranslator = new EnglishTranslator();
        System.out.println(englishTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "I am a(an) " + getLanguage() +" translator";
        }
    }

    static class EnglishTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "English";
        }
    }
}