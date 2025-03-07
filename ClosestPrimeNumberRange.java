package com.leetcode;

import java.util.Arrays;

public class ClosestPrimeNumberRange {
    public int[] closestPrimes(int left, int right) {
        // Step 1: Create a sieve to find prime numbers
        boolean prime[] = new boolean[right + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int p = 2; p * p <= right; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= right; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Step 2: Find closest prime pair in the range [left, right]
        int res[] = new int[]{-1, -1};
        int minDiff = Integer.MAX_VALUE;
        int prev = -1;  // Stores the last prime found

        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                if (prev == -1) {
                    prev = i;  // First prime found
                } else {
                    // If the difference is smaller, update the result
                    if (i - prev < minDiff) {
                        res[0] = prev;
                        res[1] = i;
                        minDiff = i - prev;
                    }
                    prev = i;  // Update previous prime
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {
        ClosestPrimeNumberRange closestPrimeNumberRange = new ClosestPrimeNumberRange();
        int[] result = closestPrimeNumberRange.closestPrimes(10,19);
        System.out.println(Arrays.toString(result));
    }

}
