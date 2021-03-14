package com.dsa_cracker.arrays;

/**
 * https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 */
public class SegregateZerosAndOnes {
    public static void main(String[] args) {
        int []arr = {1,1,0,0,1,1,0,1};
        int[] res = separateZerosAndOnes(arr);
        for(int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
    static int[] separateZerosAndOnes(int arr[]){
        int countZero = 0, countOne = 0;
        for(int i = 0; i < arr.length; i++){
            if( arr[i] == 0){
                countZero++;
            }else{
                countOne++;
            }
        }
        for(int i = 0; i < countZero; i++){
            arr[i] = 0;
        }
        for(int i = countZero; i < arr.length; i ++){
            arr[i] = 1;
        }
        return arr;
    }
}
