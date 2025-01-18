package com.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class minCost1368 {
    public int minCost(int[][] grid) {
        int[][] dirs = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int rows = grid.length, cols = grid[0].length;
        int[][] minCost = new int[rows][cols];

        // Initialize minCost with a high value
        for (int row = 0; row < rows; row++) {
            Arrays.fill(minCost[row], Integer.MAX_VALUE);
        }

        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0});
        minCost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int row = curr[0], col = curr[1];

            for (int dir = 0; dir < 4; dir++) {
                int nextRow = row + dirs[dir][0];
                int nextCol = col + dirs[dir][1];

                if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols) {
                    int cost = minCost[row][col];
                    int nextCellCost = (dir + 1 == grid[row][col]) ? 0 : 1;
                    int newCost = cost + nextCellCost;

                    if (newCost < minCost[nextRow][nextCol]) {
                        minCost[nextRow][nextCol] = newCost;
                        if (nextCellCost == 0) {
                            deque.offerFirst(new int[]{nextRow, nextCol});
                        } else {
                            deque.offerLast(new int[]{nextRow, nextCol});
                        }
                    }
                }
            }
        }

        return minCost[rows - 1][cols - 1];
    }
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1},{2,2,2,2},{1,1,1,1},{2,2,2,2}};
        minCost1368 minCost1368 = new minCost1368();
        int result = minCost1368.minCost(grid);
        System.out.println(result);
    }

}
