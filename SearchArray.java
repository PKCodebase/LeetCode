package com.leetcode;


public class SearchArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[start]<=nums[mid]){
                if(target >= nums[start] && target < nums[mid] ){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            else{
                if(target > nums[mid]  && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        SearchArray searchArray = new SearchArray();
        int result = searchArray.search(nums,target);
        System.out.println(result);
    }
}