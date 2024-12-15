package com.leetcode;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,50,6,7,8,90,100};
        int max = 0;
        int smax = 0;
        int ans = 1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            }
            else if(smax<arr[i] && max!=arr[i]){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}