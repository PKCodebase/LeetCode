package com.leetcode;

public class IncreasingTripletSubsequence {
        public boolean increasingTriplet(int[] nums) {
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;
            int third = Integer.MAX_VALUE;

            for(int i = 0;i<nums.length;i++){
                int ele = nums[i];

                if(first >= ele){
                    first = ele;
                }else if(second >= ele){
                    second = ele;
                }else{
                    third = ele;
                    return true;
                }
            }
            return false;

        }
        public static void main(String[] args) {
            int [] nums = {1,2,3,4,5};
            IncreasingTripletSubsequence increasingTripletSubsequence = new IncreasingTripletSubsequence();
            boolean result = increasingTripletSubsequence.increasingTriplet(nums);
            System.out.println(result);
        }

}
