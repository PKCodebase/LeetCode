package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumNumberOfPontsGridQueries {
    public int[] maxPoints(int[][] grid, int[] queries) {
        int m = grid.length, n = grid[0].length, k = queries.length;
        int[] result = new int[k];
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Store queries with original indices
        int[][] queryIndex = new int[k][2];
        for (int i = 0; i < k; i++) {
            queryIndex[i] = new int[]{queries[i], i};
        }
        Arrays.sort(queryIndex, Comparator.comparingInt(a -> a[0]));

        // Min-Heap to process cells in increasing order of value
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[][] visited = new boolean[m][n];

        pq.offer(new int[]{grid[0][0], 0, 0}); // Start from (0,0)
        visited[0][0] = true;

        int points = 0, index = 0;

        while (index < k) {
            int queryValue = queryIndex[index][0];

            // Expand BFS while the smallest grid value is less than the query
            while (!pq.isEmpty() && pq.peek()[0] < queryValue) {
                int[] cell = pq.poll();
                int r = cell[1], c = cell[2];
                points++;

                // Explore 4 directions
                for (int[] dir : directions) {
                    int nr = r + dir[0], nc = c + dir[1];
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && !visited[nr][nc]) {
                        visited[nr][nc] = true;
                        pq.offer(new int[]{grid[nr][nc], nr, nc});
                    }
                }
            }

            // Store result for the current query
            result[queryIndex[index][1]] = points;
            index++;
        }

        return result;
    }
    public static void main(String[] args) {
        MaximumNumberOfPontsGridQueries sol = new MaximumNumberOfPontsGridQueries();
        int[][] grid = {{1, 2, 3}, {2, 5, 7}, {3, 5, 1}};
        int[] queries = {5, 6, 2};
        int[] result = sol.maxPoints(grid, queries);
        System.out.println(Arrays.toString(result));
    }
}
