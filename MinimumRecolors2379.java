package com.leetcode;

public class MinimumRecolors2379 {
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W') w++;
        }
        int res = w;
        int n = blocks.length();
        for(int i=1;i<(n-k+1);i++){
            if(blocks.charAt(i-1) == 'W' ){
                w--;
            }
            if(blocks.charAt(i+k-1)=='W'){
                w++;
            }
            res = Math.min(res,w);
        }
        return res;
    }
    public static void main(String[] args) {
        MinimumRecolors2379 minimumRecolors2379 = new MinimumRecolors2379();
        String blocks = "WBBWWBBWBW";
        int k = 7;
        int result = minimumRecolors2379.minimumRecolors(blocks,k);
        System.out.println(result);
    }

}
