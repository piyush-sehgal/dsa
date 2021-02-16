package com.dsa_cracker._concept.searching_sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6};
        insertionSort(arr, arr.length);
    }
    public static void insertionSort(int []arr, int n){
        int i, j, key;
        for(i = 1; i < n; i++){
            key = arr[i];
            j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j -= 1;
            }
            arr[j+1] = key;
        }
        for (i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
