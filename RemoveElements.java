package com.leetcode;

public class RemoveElements {

    public static  int[] removeElement(int[] nums, int target) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=target){
                nums[k] = nums[i];
                k++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int [] nums = {3,2,2,3,5,8};
        int target = 3;
        int [] result = removeElement(nums,target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}
