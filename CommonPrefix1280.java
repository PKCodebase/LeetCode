package com.leetcode;

public class CommonPrefix1280 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int freq[] = new  int [n+1];
        int C[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2) count++;

            freq[B[i]]++;
            if(freq[B[i]]==2) count++;
            C[i] = count;
        }
        return C;

    }
    public static void main(String[] args) {
        CommonPrefix1280 commonPrefix1280 = new CommonPrefix1280();
        int[] A = {1,3,2,4};
        int[] B = {3,1,2,4};
        int[] result = commonPrefix1280.findThePrefixCommonArray(A,B);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
