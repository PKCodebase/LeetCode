package com.leetcode;

public class MaxAbsoluteSum1749 {

        public int maxAbsoluteSum(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int minSum = Integer.MAX_VALUE;
            int curPSum = 0;
            int curNSum = 0;
            for(int num :nums){
                curPSum += num;
                maxSum = Math.max(maxSum,curPSum);
                if(curPSum < 0){
                    curPSum = 0;
                }
                curNSum += num;
                minSum = Math.min(minSum,curNSum);
                if(curNSum>0){
                    curNSum = 0;
                }
            }
            return Math.max(maxSum,Math.abs(minSum));

        }
        public static void main(String[] args) {
            MaxAbsoluteSum1749 maxAbsoluteSum1749 = new MaxAbsoluteSum1749();
            int[] nums = {1,-3,2,3,-4};
            int result = maxAbsoluteSum1749.maxAbsoluteSum(nums);
            System.out.println(result);
        }
}
