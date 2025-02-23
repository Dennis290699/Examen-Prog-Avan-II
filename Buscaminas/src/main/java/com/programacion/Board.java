package com.programacion;

import java.util.Random;

public class Board {
    private final boolean[][] mines;
    private final int width, height;

    public Board(int width, int height, double probability) {
        this.width = width;
        this.height = height;
        this.mines = new boolean[height][width];
        generateBoard(probability);
    }

    private void generateBoard(double probability) {
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mines[i][j] = random.nextDouble() < probability;
            }
        }
    }

    public boolean[][] getMines() {
        return mines;
    }

    public void printBoard() {
        for (boolean[] row : mines) {
            for (boolean cell : row) {
                System.out.print(cell ? "* " : ". ");
            }
            System.out.println();
        }
    }
}
