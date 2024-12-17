package com.leetcode;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int tortoise  = 0;
        int hare  = 0;
        do {
            tortoise  = nums[tortoise ];
            hare  = nums[nums[hare ]];
        } while (tortoise  != hare );
        int finder = 0;
        while (finder != tortoise ) {
            finder = nums[finder];
            tortoise  = nums[tortoise ];
        }
        return finder;
    }
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        FindDuplicate findDuplicate = new FindDuplicate();
        int result = findDuplicate.findDuplicate(nums);
        System.out.println(result);
    }
}
