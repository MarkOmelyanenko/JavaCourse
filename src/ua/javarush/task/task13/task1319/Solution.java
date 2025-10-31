package ua.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String destination = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter(destination));

        StringBuilder stringBuilder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            stringBuilder.append(s).append("\n");
        }

        writer.write(stringBuilder.toString());
        writer.close();
    }
}
