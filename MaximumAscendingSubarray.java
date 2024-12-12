package com.leetcode;

public class MaximumAscendingSubarray {
    public int maxAscendingSum(int[] nums) {
            int max = nums[0];
            int currmax = nums[0];

            for(int i=1; i<nums.length;i++){
                if(nums[i-1]<nums[i]){
                    currmax = currmax + nums[i];
                }else{
                    max = Math.max(max,currmax);
                    currmax = nums[i];
                }
            }
            max = Math.max(max ,currmax);
            return max;
        }
        public static void main(String[] args) {
            int [] nums = {100,10,1};
            MaximumAscendingSubarray maximumAscendingSubarray = new MaximumAscendingSubarray();
            int result = maximumAscendingSubarray.maxAscendingSum(nums);
            System.out.println(result);
        }

}
