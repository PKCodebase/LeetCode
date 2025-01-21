
package com.leetcode;
public class GridGame2017 {
    public long gridGame(int[][] grid) {
        long topSum = 0;
        int n = grid[0].length;
        for(int i =0;i<n;i++){
            topSum += grid[0][i];
        }
        long bottomSum  = 0;
        long ans = Long.MAX_VALUE;
        for(int p =0;p<n;p++){
            topSum -= grid[0][p];
            ans = Math.min(ans,Math.max(topSum,bottomSum));
            bottomSum += grid[1][p];
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] grid = {{2,5,4},{1,5,1}};
        GridGame2017 gridGame2017 = new GridGame2017();
        long result = gridGame2017.gridGame(grid);
        System.out.println(result);
    }
}
