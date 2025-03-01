package com.leetcode;

public class Apply_Operation_array2460 {

        public int[] applyOperations(int[] nums) {
            int nz = 0;
            int n = nums.length;
            for(int i=0;i<n;i++){
                if(i<n-1 && nums[i] !=0 && nums[i]==nums[i+1]){
                    nums[i]*=2;
                    nums[i+1]=0;
                }
                if(nums[i] !=0){
                    if(i!=nz){
                        int temp = nums[i];
                        nums[i] = nums[nz];
                        nums[nz] = temp;
                    }
                    nz++;
                }
            }
            return nums;

        }
        public static void main(String[] args) {
            int [] nums = {1,2,2,1,1,0};
            Apply_Operation_array2460 applyOperationArray2460 = new Apply_Operation_array2460();
            int[] result = applyOperationArray2460.applyOperations(nums);
            for(int i=0;i<result.length;i++){
                System.out.print(result[i]+" ");
            }
        }
}
