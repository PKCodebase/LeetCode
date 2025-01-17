package com.leetcode;

public class BitwiseXor2683 {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 0;
        for(int val:derived){
            res = res ^ val;
        }
        return (res==0);
    }

    public static void main(String[] args) {
        BitwiseXor2683 bitwiseXor2683 = new BitwiseXor2683();
        int[] derived = {1,1,0};
        boolean result = bitwiseXor2683.doesValidArrayExist(derived);
        System.out.println(result);
    }
}
