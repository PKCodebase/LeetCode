package com.leetcode;
import java.util.Arrays;
import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

public class MinimumIndexofValidSplit {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        // Step 1: Find the dominant element using Boyer-Moore Voting Algorithm
        int candidate = -1, count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify if the candidate is dominant
        int totalFreq = 0;
        for (int num : nums) {
            if (num == candidate) {
                totalFreq++;
            }
        }
        if (totalFreq * 2 <= n) return -1; // No dominant element found

        // Step 3: Find the minimum valid split index
        int prefixCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == candidate) {
                prefixCount++;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int suffixCount = totalFreq - prefixCount;

            if (prefixCount * 2 > leftSize && suffixCount * 2 > rightSize) {
                return i;
            }
        }

        return -1; // No valid split found
    }
    public static void main(String[] args) {
        MinimumIndexofValidSplit solution = new MinimumIndexofValidSplit();

        // Example usage:
        List<Integer> nums = Arrays.asList(1, 2, 2, 2);
        int result = solution.minimumIndex(nums);
        System.out.println("Minimum index for valid split: " + result);
    }
}
