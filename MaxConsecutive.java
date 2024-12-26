package com.leetcode;

public class MaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
            MaxConsecutive maxConsecutive = new MaxConsecutive();
            int[] nums = {1,1,0,1,1,1};
            int result = maxConsecutive.findMaxConsecutiveOnes(nums);
            System.out.println(result);
        }
}
