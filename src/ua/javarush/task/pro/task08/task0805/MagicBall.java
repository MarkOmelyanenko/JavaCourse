package ua.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Безперечно";
    private static final String DEFINITELY = "Безумовно, так";
    private static final String MOST_LIKELY = "Найймовірніше";
    private static final String OUTLOOK_GOOD = "Хороші перспективи";
    private static final String ASK_AGAIN_LATER = "Запитай пізніше";
    private static final String TRY_AGAIN = "Спробуй ще";
    private static final String NO = "Моя відповідь — ні";
    private static final String VERY_DOUBTFUL = "Вельми сумнівно";

    public static String getPrediction() {
        int random = new Random().nextInt(8);
        if (random == 0) {
            return CERTAIN;
        } else if (random == 1) {
            return DEFINITELY;
        } else if (random == 2) {
            return MOST_LIKELY;
        } else if (random == 3) {
            return OUTLOOK_GOOD;
        } else if (random == 4) {
            return ASK_AGAIN_LATER;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return NO;
        } else if (random == 7) {
            return VERY_DOUBTFUL;
        } else return null;
    }
}
