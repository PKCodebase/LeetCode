package com.leetcode;

public class MaxSmax {
    public static int[] findMaxAndSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            } else if (arr[i]>smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        return new int[]{max,smax};

    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 29, 40, 54, 67, 23};
        int[] result = findMaxAndSecondMax(arr);
        System.out.println("Max: " + result[0] + ", Second Max: " + result[1]);
    }
}
