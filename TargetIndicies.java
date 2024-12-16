package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TargetIndicies {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;
        for(int ele : nums){
            if(ele == target){
                tcount++;
            }else if(ele < target){
                num++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,5};
        int target = 3;
        TargetIndicies targetIndicies = new TargetIndicies();
        List<Integer> result = targetIndicies.targetIndices(nums,target);
        System.out.println(result);
    }
}
