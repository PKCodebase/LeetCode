package com.leetcode;

public class PlusOne {
    public int[] plusOnes(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] output= new int[digits.length + 1];
        output[0] = 1;
        return output;
    }
    public static void main(String[] args) {
        int [] digits = {9,9,9};
        PlusOne plusOne = new PlusOne();
        int [] result = plusOne.plusOnes(digits);
        for(int i = 0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}

