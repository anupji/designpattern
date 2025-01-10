package com.design.pattern.leetcode;

import java.util.Arrays;

public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int targetSum = 12;

        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            while (currentSum > targetSum && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                //int[] arr = {1, 2, 3, 7, 5};
                int[] newArray = Arrays.copyOfRange(arr, start, end+1);
                System.out.println(Arrays.toString(newArray));
                return;
            }
        }

        System.out.println("No subarray found.");
    }
}
