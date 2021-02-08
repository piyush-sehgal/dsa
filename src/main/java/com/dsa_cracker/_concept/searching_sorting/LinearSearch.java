package com.dsa_cracker._concept.searching_sorting;

/**
 * TC: O(n)
 */
public class LinearSearch {
    public static void main(String[] args) {
        int []arr = {1,4,7,32,2,5,7};
        int value = 7;
        System.out.println(linearSearch(arr, value));
    }
    public static boolean linearSearch(int []arr, int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
