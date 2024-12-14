package com.leetcode;

public class BinarySearch {
        public int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start<=end){
                int mid = (start + end)/2;

                if(nums[mid] == target){
                    return mid;
                }else if(target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int [] nums = {-1,0,3,5,9,12};
            int target = 9;
            BinarySearch binarySearch = new BinarySearch();
            int result = binarySearch.search(nums,target);
            System.out.println(result);
        }

}
