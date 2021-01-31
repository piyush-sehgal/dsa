package com.dsa_cracker.arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int[] reversedArr = new int[size];
        for(int i = size-1, j = 0; i >= 0; i-- ){
            reversedArr[j++]=arr[i];
        }
        for(int i = 0; i < size; i++){
            System.out.println(reversedArr[i]);
        }
    }
}
