package com.leetcode;

public class CountPositiveNegative {
    public int maximumCount(int[] nums) {
        int n = 0;
        int p = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<0){
                n++;
            }else if(nums[i] > 0){
                p++;
            }
        }
        return Math.max(n,p);
    }

    public static void main(String[] args) {
        CountPositiveNegative countPositiveNegative = new CountPositiveNegative();
        int[] nums = {-2,-1,-1,1,2,3};
        int result = countPositiveNegative.maximumCount(nums);
        System.out.println(result);
    }
}
