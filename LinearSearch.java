package com.leetcode;

public class LinearSearch {
    public int search(int[] nums, int target) {
        int ans = -1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                ans= i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        LinearSearch linearSearch = new LinearSearch();
        int result = linearSearch.search(nums,target);
        System.out.println(result);
    }
}

