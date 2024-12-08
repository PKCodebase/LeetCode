package com.leetcode;

import java.util.Scanner;

public class Tribonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 1;

        int d = 0;
        for(int i = 3;i<=n;i++){
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        System.out.println(d);
    }

}
