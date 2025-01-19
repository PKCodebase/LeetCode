package com.leetcode;

import java.util.PriorityQueue;

public class TrappingWater407 {
    public int trapRainWater(int[][] heightMap) {
        int dir[][] = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        if (rows < 3 || cols < 3) return 0;
        int totalUnvisitedCells = rows * cols;
        boolean[][] visited = new boolean[rows][cols];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));

        // Add boundary cells to priority queue
        for (int i = 0; i < rows; i++) {
            pq.offer(new int[]{heightMap[i][0], i, 0});
            pq.offer(new int[]{heightMap[i][cols - 1], i, cols - 1});
            visited[i][0] = true;
            visited[i][cols - 1] = true;
            totalUnvisitedCells--;
            totalUnvisitedCells--;
        }
        for (int j = 1; j < cols - 1; j++) {
            pq.offer(new int[]{heightMap[0][j], 0, j});
            pq.offer(new int[]{heightMap[rows - 1][j], rows - 1, j});
            visited[0][j] = true;
            visited[rows - 1][j] = true;
            totalUnvisitedCells--;
            totalUnvisitedCells--;
        }

        int trappedWater = 0;
        int waterLevel = 0;
        while (!pq.isEmpty() && totalUnvisitedCells > 0) {
            int[] currentCell = pq.poll();
            int currentHeight = currentCell[0];
            int currentRow = currentCell[1];
            int currentCol = currentCell[2];
            waterLevel = Math.max(waterLevel, currentHeight);

            for (int direction = 0; direction < 4; direction++) {
                int neighborRow = currentRow + dir[direction][0];
                int neighborCol = currentCol + dir[direction][1];
                if (isValidCell(neighborRow, neighborCol, rows, cols) && !visited[neighborRow][neighborCol]) {
                    int neighborHeight = heightMap[neighborRow][neighborCol];
                    if (neighborHeight < waterLevel) {
                        trappedWater += waterLevel - neighborHeight;
                    }
                    pq.offer(new int[]{neighborHeight, neighborRow, neighborCol});
                    visited[neighborRow][neighborCol] = true;
                    totalUnvisitedCells--;
                }
            }
        }
        return trappedWater;
    }

    private boolean isValidCell(int row, int col, int rows, int cols) {
        return row >= 0 && col >= 0 && row < rows && col < cols;
    }
    public static void main(String[] args) {
        int[][] heightMap = {
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        };
        TrappingWater407 trappingWater407 = new TrappingWater407();
        System.out.println(trappingWater407.trapRainWater(heightMap));
    }
}
