package com.programacion;

import java.util.concurrent.Callable;

public class MineCounterTask implements Callable<int[][]> {
    private final boolean[][] mines;
    private final int startRow, endRow;

    public MineCounterTask(boolean[][] mines, int startRow, int endRow) {
        this.mines = mines;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public int[][] call() {
        int[][] result = new int[endRow - startRow][mines[0].length];
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < mines[0].length; j++) {
                if (mines[i][j]) {
                    result[i - startRow][j] = -1; // -1 para las minas
                } else {
                    result[i - startRow][j] = countAdjacentMines(i, j);
                }
            }
        }
        return result;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = Math.max(0, row - 1); i <= Math.min(mines.length - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(mines[0].length - 1, col + 1); j++) {
                if (mines[i][j]) count++;
            }
        }
        return count;
    }
}
