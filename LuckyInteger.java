package com.leetcode;

import java.util.HashMap;

public class LuckyInteger {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<arr.length;i++){
            int ele = arr[i];

            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }
        int ans = -1;

        for(int key : hm.keySet()){
            if(hm.get(key)==key){
                ans = Math.max(ans,key);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4};
        LuckyInteger luckyInteger = new LuckyInteger();
        int result = luckyInteger.findLucky(arr);
        System.out.println(result);
    }

}