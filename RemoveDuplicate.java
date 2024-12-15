package com.leetcode;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int result = removeDuplicate.removeDuplicates(nums);
        System.out.println(result);
    }
}




