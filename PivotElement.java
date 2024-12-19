package com.leetcode;

public class PivotElement {
    public int pivotIndex(int[] nums) {
        int rsum = 0;

        for(int ele : nums){
            rsum += ele;
        }
        int lsum = 0;
        for(int i =0;i<nums.length;i++){
            rsum -= nums[i];
            if(rsum == lsum){
                return i;
            }
            lsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        PivotElement pivotElement = new PivotElement();
        int[] nums = {1,7,3,6,5,6};
        int result = pivotElement.pivotIndex(nums);
        System.out.println(result);
    }
}
