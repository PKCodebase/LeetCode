package com.leetcode;

public class FirstAndLast {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int number = 8;

        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        System.out.println(first + " " + last);
    }
}
