package ua.javarush.task.pro.task12.task1212;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] copy = elements;
        capacity *= 1.5;
        elements = new String[capacity];

        for (int i = 0; i < copy.length; i++) {
            elements[i] = copy[i];
        }
    }

}
