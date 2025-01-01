package com.leetcode;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int answer[] = new int[2* nums.length];
        for(int i =0;i<nums.length;i++){
            answer[i] = nums[i];
        }
        int index = nums.length;
        for(int i=0;i<nums.length;i++){
            answer[index] = nums[i];
            index++;
        }
        return answer;

    }
    public static void main(String[] args) {
        int [] nums = {1,2,1};
        ArrayConcatenation arrayConcatenation = new ArrayConcatenation();
        int [] result = arrayConcatenation.getConcatenation(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
