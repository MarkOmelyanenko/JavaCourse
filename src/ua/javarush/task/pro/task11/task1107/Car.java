package ua.javarush.task.pro.task11.task1107;

public class Car {

    Engine engine;

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }

}
