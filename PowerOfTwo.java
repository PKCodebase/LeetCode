package com.leetcode;

import java.util.Scanner;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }else if(n==1){
            return true;
        }
        else{
            while(n%2 == 0){
                n=n/2;
            }if(n==1){
                return true;
            }else {
                return false;
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean result = powerOfTwo.isPowerOfTwo(n);
        System.out.println(result);
    }
}