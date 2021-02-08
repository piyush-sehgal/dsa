package com.dsa_cracker._concept.searching_sorting;

import java.util.Arrays;

public class TernarySearch {
    /**
     *  Similar to Binary search
     *  Divide an array/list into 3 parts instead of 2
     *  Array must be sorted
     *  [1,2,3,4,5,6,7,8,9,10]
     *  L    M1      M2     R
     *  mid1 = L + (R - L)/3
     *  mid2 = R – (R - L)/3
     *
     *  ALG
     *  - First, we compare the key with the element at mid1. If found equal, we return mid1.
     *  - If not, then we compare the key with the element at mid2. If found equal, we return mid2.
     *  - If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.
     *  - If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.
     *  - If not, then we recur to the second (middle) part.
     *
     */
    public static void main(String[] args) {
        int []arr = {10,1,9,3,8,4,7,5,6,2};
        Arrays.sort(arr);
        int val = 12;
        System.out.println(ternarySearch(arr, 0, arr.length-1, val));
    }
    public static boolean ternarySearch(int[] arr, int start, int end, int value){
        while(start <= end){
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if(arr[mid1] == value){
                return true;
            }
            if(arr[mid2] == value){
                return true;
            }
            if(value < arr[mid1]){
                end = mid1 - 1;
            }
            else if(value > arr[mid2]){
                start = mid2 + 1;
            }else{
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return false;
    }
}
