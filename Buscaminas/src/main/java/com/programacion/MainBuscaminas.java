package com.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MainBuscaminas {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int width = 16, height = 7;
        double probability = 0.2; // 20% probabilidad de mina

        Board board = new Board(width, height, probability);
        System.out.println("Tablero de Minas:");
        board.printBoard();

        boolean[][] mines = board.getMines();
        int numThreads = 4;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        List<Future<int[][]>> futures = new ArrayList<>();

        int rowsPerThread = height / numThreads;

        // Asignar bloques de filas a cada hilo
        for (int i = 0; i < numThreads; i++) {
            int startRow = i * rowsPerThread;
            int endRow = (i == numThreads - 1) ? height : startRow + rowsPerThread;
            futures.add(executor.submit(new MineCounterTask(mines, startRow, endRow)));
        }

        // Recoger los resultados
        int[][] mineCounts = new int[height][width];
        for (int i = 0; i < futures.size(); i++) {
            int[][] part = futures.get(i).get();
            for (int j = 0; j < part.length; j++) {
                System.arraycopy(part[j], 0, mineCounts[i * rowsPerThread + j], 0, width);
            }
        }

        executor.shutdown();

        System.out.println("\nConteo de Minas Adyacentes:");
        for (int[] row : mineCounts) {
            for (int cell : row) {
                System.out.print((cell == -1 ? "B" : cell) + " ");
            }
            System.out.println();
        }
    }
}
