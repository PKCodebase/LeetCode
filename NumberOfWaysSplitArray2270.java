package com.leetcode;

public class NumberOfWaysSplitArray2270 {
    public int waysToSplitArray(int[] nums) {
        long right = 0;
        long left = 0;
        for (int num : nums) {
            right += num;
        }
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            left += nums[i];
            right -= nums[i];
            if (left >= right) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfWaysSplitArray2270 numberOfWaysSplitArray2270 = new NumberOfWaysSplitArray2270();
        int[] nums = {10,4,-8,7};
        int result = numberOfWaysSplitArray2270.waysToSplitArray(nums);
        System.out.println(result);
    }
}