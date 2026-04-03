package ua.javarush.task.task20.task2021;

import java.io.*;

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException("Не сьогодні!");
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException("Не сьогодні!");
        }
    }

    public static void main(String[] args) {

    }
}
