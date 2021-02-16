package com.dsa_cracker._concept.searching_sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {5,4,2,3,1};
        bubbleSort(arr, arr.length);
    }
    public static void bubbleSort(int []arr, int n){
        int i,j;
        for(i = 0; i < n-1; i++){
            for(j = 0; j < n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
