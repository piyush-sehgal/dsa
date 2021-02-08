package com.dsa_cracker._concept.searching_sorting;

import java.util.Arrays;

/**
 *  TC: O(logN)
 *  mid = start + (end - start) / 2
 *
 *  **Array should be sorted**
 * 1. Compare X with the middle element of the array.
 * 2. If X matches with middle element, we return the mid index.
 * 3. Else If X is greater than the mid element, then X can only lie in right half subarray after the mid element.
 *    So we will now look for X in only the right half ignoring the complete left half.
 * 4. Else if X is smaller, search for X in the left half ignoring the right half.
 *
 *  **built-in methods do not sort the array, sort the array before using these methods**
 *  1. Arrays.binarySearch(arr, key); returns index.
 *        * If not found the returns -(start + 1)
 *        * If input list is not sorted, the results are undefined.
 *        * If there are duplicates, there is no guarantee which one will be found.
 *  2. Collections.binarySearch(list, key)
 *
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,7,5,4,2,8,6,10, 9, 11};
        int size = arr.length, start = 0, end = size-1, key = 15;
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, start, end, key));
    }
    public static boolean binarySearch(int arr[], int start, int end, int value){
        /**
         * Iterative approach
         *
         * while(start < end){
         *             int mid = start + (end - start) / 2;
         *             if(arr[mid] == value){
         *                 return true;
         *             }
         *             if( arr[mid] < value){
         *                 start = mid + 1;
         *             }else{
         *                 end = mid - 1;
         *             }
         *         }
         *         return false;
         */
        /**
         * Recursive approach
         */
        if(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == value){
                return true;
            }
            if(arr[mid] < value){
                return binarySearch(arr, mid+1, end, value);
            }
            return binarySearch(arr, start, mid - 1, value);
        }
        return false;
    }
}
