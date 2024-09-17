package com.design.pattern.binarylinearsearch;

public class LinearBinary {
    String s1;
    public static void main(String[] args) {
        String s="";
        System.out.println(s);
        int num[] = new int[10000];
        num[9999] = 900;
        int target = 900;
        //int num[] = {2,3,5,6,7,8,9};
        //int num[] = {2,9,8,5,7,3,6};
        int p = linearSearch(num, target);
        int m = binarySearch(num, target);
        //int m = binarySearch2(num, target, 0, num.length-1);
        if(m==-1){
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position "+ (m+1));
        }

        if(p==-1){
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at position "+ (p+1));
        }
    }

    private static int binarySearch2(int[] num, int target, int left, int right) {
        while(left<=right){
            int mid = (left+right)/2;
            if(num[mid]==target) {
                return mid;
            }
            else if (num[mid]<target) {
                return binarySearch2(num, target, mid+1, right);
            } else if (num[mid]>target) {
                return binarySearch2(num, target, left, mid-1);
            }
        }
        return -1;
    }
    private static int binarySearch(int[] num, int target) {
        int steps=0;
        int left =0,right= num.length-1;
        while(left<=right){
            steps++;
            int mid = (left+right)/2;
            if(num[mid]==target) {
                System.out.println("No of steps taken by binary search "+ steps);
                return mid;
            }
            else if (num[mid]<target) {
                left= ++mid;
            } else if (num[mid]>target) {
                right= --mid;
            }
        }
        return -1;
    }
    private static int linearSearch(int[] num, int target) {
        int steps=0;
        for(int n=0; n< num.length; n++) {
                steps++;
            if (num[n] == target) {
                System.out.println("No of steps taken by linear search "+ steps);
                return n;
            }
        }
        return -1;
    }
}
