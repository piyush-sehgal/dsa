package com.dsa_cracker.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 */
public class MaxAndMin {

    public static class Result{
        int max;
        int min;
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();
        if(size < 0){
            return;
        }
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Result result = maxAndMin(arr, size);
        System.out.println("Max: " + result.max);
        System.out.println("Min: " + result.min);
    }

    public static Result maxAndMin(int arr[], int size){
        Result result = new Result();

        if(size == 0){
            return result;
        }
        if(size == 1){
            result.max = arr[0];
            result.min = arr[0];
        }else{
            if (arr[0] > arr[1]) {
                result.max = arr[0];
                result.min = arr[1];
            }
            else {
                result.max = arr[1];
                result.min = arr[0];
            }

            for(int i = 2; i < size; i++){
                if(arr[i] > result.max){
                    result.max = arr[i];
                }
                if(arr[i] < result.min){
                    result.min = arr[i];
                }
            }
        }
        return result;
    }


}
