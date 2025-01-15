package com.leetcode;

public class MinimizeXor2429 {
    public int minimizeXor(int num1, int num2) {
        int setBits = Integer.bitCount(num2);
        int bit = 31;
        int res = 0;
        while(bit>=0 && setBits>0 ){
            if((num1 & (1 << bit))!=0){
                res = res | (1<<bit);
                setBits--;
            }
            bit--;
        }
        bit = 0;
        while(setBits>0 && bit<=32){
            if((num1 & (1 << bit))==0){
                res = res | (1<<bit);
                setBits--;
            }
            bit++;
        }
        return res;

    }
    public static void main(String[] args) {
        MinimizeXor2429 minimizeXor2429 = new MinimizeXor2429();
        int num1 = 3;
        int num2 = 5;
        int result = minimizeXor2429.minimizeXor(num1, num2);
        System.out.println(result);
    }
}
