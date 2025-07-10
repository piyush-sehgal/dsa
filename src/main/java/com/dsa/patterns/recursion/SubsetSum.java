package com.dsa.patterns.recursion;

public class SubsetSum {

    public static void subsetSum(int[] arr) {
        calculateSubsetSum(arr, arr.length, 0, 0);
    }
    private static void calculateSubsetSum(int[] arr, int n, int idx, int sum) {
        if(idx == n) {
            System.out.println(sum);
            return;
        }
        calculateSubsetSum(arr, n, idx + 1, sum);
        calculateSubsetSum(arr, n, idx + 1, sum + arr[idx]);
    }
}

