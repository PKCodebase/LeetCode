package com.leetcode;

public class Transpose {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transpose[][] = new int [cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] =matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Transpose transpose = new Transpose();
        int[][] result = transpose.transpose(matrix);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }
}
