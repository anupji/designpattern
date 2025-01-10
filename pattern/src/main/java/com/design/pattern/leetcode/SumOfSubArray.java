package com.design.pattern.leetcode;

import java.util.Arrays;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};

        int[] ints = Arrays.copyOfRange(arr, 2, 5);
        //System.out.println(Arrays.toString(ints));
        int targetSum = 12;
        int curSum = 0, startIdx = 0;
        for (int endIdx = 0; endIdx < arr.length - 1; endIdx++) {
            curSum += arr[endIdx];
            while (curSum> targetSum && startIdx<=endIdx) {
                curSum -= arr[startIdx];
                startIdx++;
            }
            if (curSum == targetSum) {
                System.out.println("Sub array found from index " + startIdx + " to index " + endIdx);
                return;
            }
        }
        System.out.println("No sub array found");
    }
}
