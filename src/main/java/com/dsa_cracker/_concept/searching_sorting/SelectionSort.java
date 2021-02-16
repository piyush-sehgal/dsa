package com.dsa_cracker._concept.searching_sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,6};
        selectionSort(arr, arr.length);
    }
    public static void selectionSort(int []arr, int n){
        int i, j, minIndex;
        for(i = 0; i < n-1; i++){
            minIndex = i;
            for(j = i+1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        for(i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
