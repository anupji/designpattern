package com.design.pattern.leetcode;

import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        //int a[]= {5, 2, 6, 1, 4};
        //int a[]={3, 5, 1, 7, 4, 9, 3};
        int a[]={3,1,4,8,7,2,5};
        int maxProfit = maxProfits(a);
        maxProfitSell(a);
        System.out.println(maxProfit);
    }

    private static void maxProfitSell(int[] a) {
        int aux[] = new int[a.length];
        int maxSoFar = 0, maxProfit=0, profit=0;
        for (int i = aux.length-1; i >=0 ; i--) {
            maxSoFar = Math.max(maxSoFar, a[i]);
            aux[i]= maxSoFar;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(aux));
        for (int i = 0; i < a.length; i++) {
            profit = aux[i] -a[i];
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);
    }

    //https://youtu.be/34WE6kwq49U
    // time complexity O(n^2) brute force solution
    private static int maxProfits(int[] a) {
        int profit =0, maxProfit =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                profit = a[i] - a[j];
                maxProfit = Math.max(profit, maxProfit);
            }
        }
        return maxProfit;
    }

    // time complexity O(n) space complexity O(1)
    private static int maxProfit(int[] a) {
        int maxProfit =0;
        int minSoFar = a[0];
        for (int i = 0; i < a.length; i++) {
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            maxProfit= Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
