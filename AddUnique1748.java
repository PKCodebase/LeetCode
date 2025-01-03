package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AddUnique1748 {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res = 0;
        for(int i : map.keySet()){
            if(map.get(i)==1){
                res += i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,2};
        AddUnique1748 addUnique1748 = new AddUnique1748();
        int result = addUnique1748.sumOfUnique(nums);
        System.out.println(result);
    }
}
