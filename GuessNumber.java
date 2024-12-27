//package com.leetcode;
//
//public class GuessNumber {
//    private int guess;
//
//    // Constructor to set the picked number
//    public GuessNumber(int guess) {
//        this.guess = guess;
//    }
//    public int guessNum(int num) {
//        if (num == guess) {
//            return 0; // Correct guess
//        } else if (num < guess) {
//            return 1; // Guessed number is too low
//        } else {
//            return -1; // Guessed number is too high
//        }
//    }
//    public int guessNumber(int n) {
//
//        int start = 0;
//        int end = n;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            int result = guess(mid);
//            if(result==0){
//                return mid;
//            }else if(guess(mid)==1){
//                start = mid+1;
//            }else{
//                end= mid-1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int n = 10;
//        int guess = 6;
//        GuessNumber guessNumber = new GuessNumber();
//        int result = guessNumber.guessNumber(n);
//        System.out.println(result);
//    }
//}
