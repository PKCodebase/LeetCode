package com.leetcode;

public class CountLargestGroup {
    public static int findSum(int num){
        int sum=0;
        while(num >0){
            sum +=num%10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[]args){
        int n = 2;
        System.out.println(findSum(n));
    }
}
