package com.dsa.patterns.recursion;

public class ReverseArray {

    public static void reverse(int[] arr, int n) {
        if(n == arr.length) return;
        reverse(arr, n + 1);
        System.out.print(arr[n] + " ");
    }
}
