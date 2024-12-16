package com.leetcode;

import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String arr[] =  new String[nums.length];
        for(int i = 0;i<nums.length;i++){
            arr[i] = nums[i] + "";
        }
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length-1; i>=0;i--){
            sb.append(arr[i]);
        }if (sb.charAt(0) == '0') {
            return "0";
        }else {
            return sb.toString();
        }

    }
    public static void main(String[] args) {
        int[] nums = {10,2,3,40};
        LargestNumber obj = new LargestNumber();
        String result = obj.largestNumber(nums);
        System.out.println(result);
    }
}


// Logic of the Custom Comparator
//(a + b).compareTo(b + a)

//For two strings a and b, the comparator:
//Concatenates them as a + b and b + a.
//Compares the two concatenated results lexicographically.
//Decides the order based on which concatenation yields a larger string.

//How It Works:
//If (a + b) < (b + a) → a comes after b.
//If (a + b) > (b + a) → a comes before b.

//Example Comparison:
//For a = "2" and b = "10":
//"2" + "10" = "210"
//"10" + "2" = "102"
//Since "210" > "102", 2 should come before 10.
//For a = "3" and b = "30":
//
//"3" + "30" = "330"
//"30" + "3" = "303"
//Since "330" > "303", 3 should come before 30.

