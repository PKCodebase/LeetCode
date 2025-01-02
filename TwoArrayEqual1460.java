package com.leetcode;

import java.util.Arrays;

public class TwoArrayEqual1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        Arrays.sort(target);

        for(int i=0;i<arr.length;i++){
            if(arr[i] != target[i]){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};
        boolean result = new TwoArrayEqual1460().canBeEqual(target, arr);
        System.out.println(result);
    }
}