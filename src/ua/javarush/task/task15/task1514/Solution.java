package ua.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(1.0, "string1");
        labels.put(2.0, "string2");
        labels.put(3.0, "string3");
        labels.put(4.0, "string4");
        labels.put(5.0, "string5");
    }
}
