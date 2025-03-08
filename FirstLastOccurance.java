package com.leetcode;

public class FirstLastOccurance {

        public static int lastOccurance(int arr[],int num,int start,int end) {
            while(start<=end) {
                int mid = (start + end) / 2;

                if (num < arr[mid]) {
                    end = mid - 1;
                } else if (num > arr[mid]) {
                    start = mid + 1;
                } else if (num == arr[mid]) {
                    if (mid == arr.length - 1 || arr[mid] != arr[mid + 1]) {
                        return mid;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return -1;

        }
        public static void main(String[] args) {
            int arr[] = {10,20,30,30,40,60,70,80,80};
            int num = 80;
            int start = 0;
            int end = arr.length-1;
            int result = lastOccurance(arr,num,start,end);
            System.out.println(result);
            if (result == -1) {
                System.out.println("Element not found");
            }else{
                System.out.println("Element found at index: " + result);
            }
        }
        public static int firstOccurance(int arr[], int num, int start, int end) {
            while(start<=end) {
                int mid = (start + end) / 2;

                if (num < arr[mid]) {
                    end = mid - 1;
                } else if (num > arr[mid]) {
                    start = mid + 1;
                } else if (num == arr[mid]) {
                    if (mid == 0 || arr[mid] != arr[mid - 1]) {
                        return mid;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;

        }

}
