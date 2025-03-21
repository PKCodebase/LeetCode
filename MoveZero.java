package com.leetcode;

public class MoveZero {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int i = index;i<nums.length;i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        MoveZero moveZero = new MoveZero();
        moveZero.moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
