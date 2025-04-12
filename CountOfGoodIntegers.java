package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOfGoodIntegers {
    public long countGoodIntegers(int n, int k) {
        Set<String> uniqueDigitSets = new HashSet<>();

        int base = (int) Math.pow(10, (n - 1) / 2);  // start from half of n-digit number (for palindrome)
        int skipMiddleDigit = n % 2;  // used to skip middle digit in even-length palindromes

        // Step 1: Generate all possible palindromic numbers of n digits
        for (int i = base; i < base * 10; i++) {
            String leftHalf = Integer.toString(i);
            String rightHalf = new StringBuilder(leftHalf).reverse().substring(skipMiddleDigit);
            String fullPalindrome = leftHalf + rightHalf;

            long number = Long.parseLong(fullPalindrome);

            // Step 2: Check if it's divisible by k
            if (number % k == 0) {
                char[] digits = fullPalindrome.toCharArray();
                Arrays.sort(digits);  // sort to normalize permutations
                uniqueDigitSets.add(new String(digits));
            }
        }

        // Step 3: Precompute factorials for permutations
        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        // Step 4: Count permutations of each unique digit set that don’t start with 0
        long result = 0;
        for (String sortedDigits : uniqueDigitSets) {
            int[] count = new int[10];
            for (char digit : sortedDigits.toCharArray()) {
                count[digit - '0']++;
            }

            // Fix first digit (not zero), and count valid permutations
            long totalPermutations = 0;
            for (int firstDigit = 1; firstDigit <= 9; firstDigit++) {
                if (count[firstDigit] == 0) continue;

                count[firstDigit]--;
                long ways = factorial[n - 1];

                for (int c : count) {
                    ways /= factorial[c];
                }

                totalPermutations += ways;
                count[firstDigit]++;
            }

            result += totalPermutations;
        }

        return result;
    }
    public static void main(String[] args) {
        CountOfGoodIntegers sol = new CountOfGoodIntegers();
        System.out.println(sol.countGoodIntegers(3, 2)); // Example usage
    }
}
