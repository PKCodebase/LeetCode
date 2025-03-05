package com.leetcode;

public class SumOfPower1780 {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
    public static void main(String[] args) {
        SumOfPower1780 sumOfPower1780 = new SumOfPower1780();
        int n = 91;
        boolean result = sumOfPower1780.checkPowersOfThree(n);
        System.out.println(result);
    }
}
