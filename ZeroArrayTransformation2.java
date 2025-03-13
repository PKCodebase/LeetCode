package com.leetcode;

public class ZeroArrayTransformation2 {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length,sum=0,k=0;
        int dA[] = new int[n+1];
        for(int index=0;index<n;index++){
            while(sum+dA[index]<nums[index]){
                k++;
                if(k>queries.length){
                    return -1;
                }
                int left = queries[k-1][0];
                int right = queries[k-1][1];
                int val = queries[k-1][2];
                if(right >= index){
                    dA[Math.max(left,index)] += val;
                    dA[right+1] -= val;
                }
            }
            sum += dA[index];
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int[][] queries = {{1,1,2}};
        ZeroArrayTransformation2 sol = new ZeroArrayTransformation2();
        System.out.println(sol.minZeroArray(nums, queries));
    }
}
