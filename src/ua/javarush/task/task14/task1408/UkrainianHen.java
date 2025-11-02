package ua.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + String.format(" Моя країна - %s. Я несу %d яєць на місяць.",
                Country.UKRAINE, getCountOfEggsPerMonth());
    }
}
