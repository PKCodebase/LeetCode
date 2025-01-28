package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] num, int k) {
            List<Integer> ans = new ArrayList<>();
            int p = num.length-1;

            int carry = 0;

            while(p>=0 || k>0){
                int numval = 0;
                if(p>=0){
                    numval = num[p];
                }
                int d = k % 10;

                int sum = numval + d +carry;
                int digit = sum %  10;
                carry = sum/10;

                ans.add(digit);

                p--;
                k=k/10;
            }
            if(carry>0){
                ans.add(carry);

            }
            Collections.reverse(ans);
            return ans;
        }
        public static void main(String[] args) {
            int num[] = {1,2,0,0};
            int k = 34;
            ArrayFormOfInteger arrayFormOfInteger = new ArrayFormOfInteger();
            List<Integer> result = arrayFormOfInteger.addToArrayForm(num,k);
            System.out.println(result);
        }

}
