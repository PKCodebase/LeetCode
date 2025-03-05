package com.leetcode;

public class CountTotalNumberColoredShells {
    public static long coloredCells(int n) {
        return  1 + (long) n* (n-1) * 2;

    }
    public static void main(String[] args) {
        int n = 3;
        long result = coloredCells(n);
        System.out.println(result);
    }

}
