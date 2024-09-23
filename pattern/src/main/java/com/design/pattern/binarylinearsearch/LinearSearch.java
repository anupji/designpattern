package com.design.pattern.binarylinearsearch;

public class LinearSearch {
    //private static int steps= 0;
    public static void main(String[] args) {
        //int num[] = {2,4,3,5,6,7};
        int num[]={1,2,3,4,5,6,7,8,9};
        int target =4;
        int m = linearSearch(num, target);
        int l = binarySearch(num, target, 0, num.length-1, 0);
        if(l==-1){
            System.out.println("Element not found.");
        }else {
            System.out.println("Element found at position "+ (l+1));
        }
    }

    private static int binarySearch(int[] num, int target, int left, int right, int steps) {
        //int steps=0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (target == num[mid]) {
                System.out.println("No of steps taken by binary search "+ steps);
                return mid;
            } else if (num[mid] < target) {
                //left = mid + 1;
                return binarySearch(num, target, mid+1, right, steps);
            } else if (num[mid] > target) {
                //right = mid - 1;
                return binarySearch(num, target, left, mid-1, steps);
            }
        }
        return -1;
    }

    private static int linearSearch(int[] num, int target) {
        int steps =0;
        for (int i = 0; i < num.length; i++) {
            steps++;
            if(num[i]==target) {
                System.out.println("Element found in *linear search* in steps "+ steps);
                return i;
            }
        }
        return -1;
    }
}
