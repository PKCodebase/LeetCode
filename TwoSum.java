package com.leetcode;

public class TwoSum {

        public int[] twoSum(int[] numbers, int target) {
            int ans [] = new int [2];
            int start = 0;
            int end = numbers.length-1;

            while(start<end){
                int sum = numbers[start] + numbers[end];

                if(sum == target){
                    ans[0] = start + 1;
                    ans[1] = end + 1;

                    return ans;
                }else if(sum > target){
                    end--;
                }else{
                    start++;
                }

            }
            return ans;
        }
        public static void main(String[] args) {
            int [] numbers = {2,7,11,15};
            int target = 9;
            TwoSum twoSum = new TwoSum();
            int result [] = twoSum.twoSum(numbers,target);
            System.out.println(result[0] + " " + result[1]);
        }
}
