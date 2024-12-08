package com.leetcode;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        int []input = {2,4, 6,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        for(int i=0;i<input.length;i++){
            for(int j = i; j<input.length;j++){
                if(input[i]+input[j] == num){
                    System.out.println(i+ " " + j);
                    break;
                }
            }
        }

    }
}
