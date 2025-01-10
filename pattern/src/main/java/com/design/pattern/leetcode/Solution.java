package com.design.pattern.leetcode;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

        public int binarysearch(int[] arr, int k) {
            int low = 0, high = arr.length - 1, result=0;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Check if x is present at mid
                if (arr[mid] == k)
                    result=mid;

                // If x greater, ignore left half
                if (arr[mid] < k)
                    low = mid + 1;

                    // If x is smaller, ignore right half
                else
                    high = mid - 1;

            }

            if(result==0) {result= -1;}
            return result;
        }

    public static void main(String[] args) {

        Set<String> aSet = new LinkedHashSet<>();
        boolean vl1 = aSet.add("1");
        boolean vl2 = aSet.add("1");
        System.out.println(vl1+" "+vl2+" "+aSet);

        // Define the Predicate to check if a number is a palindrome
        Predicate<Integer> pred = tNum -> {
            int aNum = tNum, aSum = 0, r;
            while (aNum > 0) {
                r = aNum % 10;
                aSum = aSum * 10 + r;
                aNum /= 10;
            }
            return tNum == aSum;
        };
        int bNum = 121;
        //System.out.println("Is " + bNum + " a palindrome? " + pred.test(bNum));

        int aArr[] ={2,2,5,9,100,18,18,15,29};
        int bArr[] = new int[101];
        for(int i : aArr){
            bArr[i]=1;
        }
        for (int i = 1; i < bArr.length ; i++) {
            if(bArr[i]==0){
                //System.out.print(i+" ");
            }
        }

        String gStr = "I love java";
        String hStr[] = gStr.split("\\s");
        String iStr ="";
        for(int s=0;s<hStr.length;s++) {
            iStr += hStr[hStr.length-1-s]+" ";
        }
        //System.out.println(iStr);
        String jStr = IntStream.range(0, hStr.length)
                .mapToObj(s -> hStr[hStr.length - 1 - s])
                .collect(Collectors.joining(" "));
        //System.out.println(jStr);

        String pStr = "Priivaccy"; //Privacy
        String fStr = pStr.chars()
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
        //System.out.println(fStr);
        Set<Character> chSet = new LinkedHashSet<>();
        for(char c: pStr.toCharArray()) {
            chSet.add(c);
        }
        String eStr = chSet.stream().map(String::valueOf).collect(Collectors.joining());
        //System.out.println(eStr);
        //Integer.MIN_VALUE;
        Solution sol = new Solution();
        int arrn [] =new int[]{1 ,28 ,36, 44, 48, 64, 78, 78};
        int k=1;
        //System.out.println(sol.binarysearch(new int[]{1 ,28 ,36, 44, 48, 64, 78, 78}, 1));
        Arrays.stream(arrn).sorted().boxed().collect(Collectors.toList()).indexOf(k);

        int n =12;
        String s = String.valueOf(n); int sum=0;
        for(char i : s.toCharArray()) {
            //System.out.println((int)i);
            sum+= Integer.valueOf(String.valueOf(i));
        }
        String aStr = "Java tutorial by by jay";
        String bStr[] = aStr.split("\\s");
        Set<String> uSet = Arrays.stream(bStr)
                .collect(Collectors.toSet());
       // System.out.println(uSet);

        String cStr = uSet.stream().collect(Collectors.joining(" "));
        //System.out.println(cStr);
        String dStr = Arrays.stream(aStr.split("\\s"))
                .distinct()
                .collect(Collectors.joining(" "));
        //System.out.println(dStr);
        //System.out.println(sum);

        int max =0;
        for(int i=0; i<arrn.length; i++){
            if(max<arrn[i]) max=arrn[i];
        }
        //System.out.println(max);

    }
}
