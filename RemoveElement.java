package com.leetcode;

public class RemoveElement {

        public int removeElement(int[] nums, int val) {
            int ptr = 0;

            for(int i = 0;i<nums.length;i++){
                if(nums[i] != val){
                    nums[ptr] = nums[i];
                    ptr++;
                }
            }
            return ptr;
        }
        public static void main(String[] args) {
            int [] nums = {3,2,2,3};
            int val = 3;
            RemoveElement removeElement = new RemoveElement();
            int result = removeElement.removeElement(nums, val);
            System.out.println(result);
        }
}
