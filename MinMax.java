package com.leetcode;

public class MinMax {

    public static int[] minMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i< arr.length-1;i++){
            if(arr[i+1]<min){
                min=arr[i];
            } else if (arr[i]>max) {
                max = arr[i];
            }
        }
        return new int []{min,max};

    }

    public static void main(String[] args) {
        int arr[] = {10, 30, 29, 40, 54, 67, 23};
        int[] result = minMax(arr); // Receive the min and max in an array
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);

    }
}