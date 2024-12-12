package com.leetcode;

public class BulbSwitcher {
        public int bulbSwitch(int n) {
            int count = 0;

            int i = 1;
            while(i*i<=n){
                count++;
                i++;
            }
            return count;
        }
        public static void main(String[] args) {
            BulbSwitcher bulbSwitcher = new BulbSwitcher();
            int result = bulbSwitcher.bulbSwitch(3);
            System.out.println(result);
        }
}