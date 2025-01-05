package com.leetcode;

public class DiagonalSum1572 {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i =0; i<n;i++){
            for(int j =0;j<n;j++){
                if(i==j  || i+j == n-1 ){
                    sum += mat[i][j];

                }
            }
        }
        return sum;


    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        DiagonalSum1572 diagonalSum1572 = new DiagonalSum1572();
        int result = diagonalSum1572.diagonalSum(mat);
        System.out.println(result);
    }
}
