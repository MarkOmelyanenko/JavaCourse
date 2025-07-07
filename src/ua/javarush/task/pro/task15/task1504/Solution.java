package ua.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine()));) {

            byte[] read = inputStream.readAllBytes();

            byte tmp = 0;

            for (int i = 0; i < read.length; i += 2) {
                if (i == read.length - 1) {
                    continue;
                }
                tmp = read[i];
                read[i] = read[i + 1];
                read[i + 1] = tmp;
            }

            outputStream.write(read, 0, read.length);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

