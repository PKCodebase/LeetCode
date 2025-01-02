package com.leetcode;

import java.util.HashMap;

public class DistinictArray2053 {
       public String kthDistinct(String[] arr, int k) {
   HashMap<String,Integer> freqMap = new HashMap<>();
   for(String str : arr){
    freqMap.put(str,freqMap.getOrDefault(str,0)+1);
   }
   for(String str : arr){
    if(freqMap.get(str)==1){
        k--;
    }
    if(k==0){
        return str;
    }
   }
   return "";
    }
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        String ans = new DistinictArray2053().kthDistinct(arr, k);
        System.out.println(ans);
    }
}
    
