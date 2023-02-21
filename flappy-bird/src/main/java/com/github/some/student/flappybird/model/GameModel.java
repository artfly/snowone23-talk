package com.github.some.student.flappybird.model;

public class GameModel {

    private Pipe[] pipes;
    private FlappyBird flappyBird;

    void checkCollisions() {
        boolean found = false;
        for (Pipe pipe : pipes) {
            if (pipe.collision(flappyBird)) {
                found = true;
            }
        }
        if (found) {
            handleCollisions();
        }
    }

    private static void handleCollisions() {

    }


    private static class FlappyBird {

    }

    private static class Pipe {

        private boolean collision(FlappyBird flappyBird) {
            return true;
        }
    }

}
