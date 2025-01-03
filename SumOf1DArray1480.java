package com.leetcode;

public class SumOf1DArray1480 {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i =1;i<nums.length;i++){
            sum = nums[i] + nums[i-1];
            nums[i] = sum;

        }
        return nums;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        SumOf1DArray1480 sumOf1DArray1480 = new SumOf1DArray1480();
        int [] result = sumOf1DArray1480.runningSum(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
