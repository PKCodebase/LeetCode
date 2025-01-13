package com.leetcode;

public class SmallestIndexValue2057 {
    public int smallestEqual(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(i%10==nums[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] nums = {4,3,2,1};
        SmallestIndexValue2057 smallestIndexValue2057 = new SmallestIndexValue2057();
        int result = smallestIndexValue2057.smallestEqual(nums);
        System.out.println(result);
    }

}
