package com.leetcode;

public class MaximumScore1422 {
    public int maxScore(String s) {
        int ones = 0;
        int n = s.length();
        for(int i = 0 ; i<n;i++){
            if(s.charAt(i) == '1')
                ones++;
        }
        int res = 0;
        int zeros = 0;
        for(int i = 0;i<n-1;i++){
            if(s.charAt(i) == '0') zeros++;
            else ones--;
            res  = Math.max(res,zeros+ones);
        }
        return res ;
    }
    public static void main(String[] args) {
        String s = "011101";
        MaximumScore1422 maximumScore1422 = new MaximumScore1422();
        int result = maximumScore1422.maxScore(s);
        System.out.println(result);
    }

}
