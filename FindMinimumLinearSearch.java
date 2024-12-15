package com.leetcode;

public class FindMinimumLinearSearch {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8,2, 8, 10};
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
