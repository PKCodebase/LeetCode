package com.leetcode;

public class MaximumCandiesAllocated {
    public int maximumCandies(int[] candies, long k) {
        if (k == 0) {
            return 0;
        }
        long totalCandies = 0;
        int maxCandy = 0;

        for (int candy : candies) {
            totalCandies += candy;
            maxCandy = Math.max(maxCandy, candy);
        }

        if (totalCandies < k)
        {
            return 0;
        }

        int start = 1, end = maxCandy, result = 0;

        while (start <= end) {
            int mid = (start+end)/ 2;
            long count = 0;

            for (int candy : candies) {
                count += candy / mid;
            }

            if (count >= k) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] candies = {5,8,6};
        long k = 3;
        MaximumCandiesAllocated maximumCandiesAllocated = new MaximumCandiesAllocated();
        int result = maximumCandiesAllocated.maximumCandies(candies,k);
        System.out.println(result);
    }
}
