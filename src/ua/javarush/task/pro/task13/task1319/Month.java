package ua.javarush.task.pro.task13.task1319;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {

        Month[] months = new Month[3];
        months[0] = DECEMBER;
        months[1] = JANUARY;
        months[2] = FEBRUARY;

        return months;
    }

    public static Month[] getSpringMonths() {

        Month[] months = new Month[3];
        months[0] = MARCH;
        months[1] = APRIL;
        months[2] = MAY;

        return months;
    }

    public static Month[] getSummerMonths() {

        Month[] months = new Month[3];
        months[0] = JUNE;
        months[1] = JULY;
        months[2] = AUGUST;

        return months;
    }

    public static Month[] getAutumnMonths() {

        Month[] months = new Month[3];
        months[0] = SEPTEMBER;
        months[1] = OCTOBER;
        months[2] = NOVEMBER;

        return months;
    }
}
