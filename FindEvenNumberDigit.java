package com.leetcode;

public class FindEvenNumberDigit {
        public int findNumbers(int[] nums) {
            if(nums.length ==0){
                return 0;
            }
            int count = 0;
            for(int i=0;i<nums.length;i++){
                int numsOfDigits = 0;
                while(nums[i] !=0){
                    nums[i] = nums[i]/10;
                    numsOfDigits++;
                }
                if(numsOfDigits % 2==0){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            FindEvenNumberDigit findEvenNumberDigit = new FindEvenNumberDigit();
            int [] nums = {12,345,2,6,7896};
            int result = findEvenNumberDigit.findNumbers(nums);
            System.out.println(result);
        }
}
