package com.leetcode;

public class MissingNumber {
        public int missingNumber(int[] nums) {
            int range = nums.length;

            int actualSum = (range*(range+1))/2;

            int currentSum = 0;
            for(int i = 0;i<nums.length;i++){
                currentSum = currentSum + nums[i];
            }
            int ans =  actualSum - currentSum;
            return ans;

        }
        public static void main(String[] args) {
            int [] nums = {3,0,1};
            MissingNumber missingNumber = new MissingNumber();
            int result = missingNumber.missingNumber(nums);
            System.out.println(result);
        }

}
