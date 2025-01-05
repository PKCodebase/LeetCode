package com.leetcode;

public class CountNegative1351 {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int count = 0;
        for(int i = 0;i<rows;i++){
            int col = grid[i].length;
            for(int j =0;j<col;j++){
                if(grid[i][j] < 0){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        CountNegative1351 countNegative1351 = new CountNegative1351();
        int result = countNegative1351.countNegatives(grid);
        System.out.println(result);
    }
}
