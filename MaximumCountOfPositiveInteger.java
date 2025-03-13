package com.leetcode;

public class MaximumCountOfPositiveInteger {
    public static int maximumCount(int[] nums) {
        int pcount = 0;
        int ncount = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ncount++;
            }else if(nums[i]<0){
                pcount++;
            }
        }
        return Math.max(pcount,ncount);

    }
    public static void main(String[] args) {
        int [] nums = {-2,-1,-1,1,2,3};
        int result = maximumCount(nums);
        System.out.println(result);
    }
}
