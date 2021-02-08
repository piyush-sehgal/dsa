package com.dsa_cracker.arrays;

import java.util.Scanner;
import static sun.swing.MenuItemLayoutHelper.max;

/**
 * https://www.geeksforgeeks.org/trapping-rain-water/
 */
public class TrappingRainWater {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = s.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print(i+1+". ");
            array[i]=s.nextInt();
        }
        System.out.println(findWater(array, array.length)+" units of water can be stored");
    }
    static int findWater(int[] array, int size){
        int total = 0;
        for(int i=1; i<size-1; i++){
            int left_max = findLeftMax(array, size, i);
            int right_max = findRightMax(array, size, i);
            total = total + Math.min(left_max,right_max) - array[i];
        }
        return total;
    }

    static int findLeftMax(int[] array, int size, int index){
        int leftMax = index;
        for(int j=0; j<index; j++){
            leftMax = max(leftMax, array[index]);
        }
        return leftMax;
    }

    static int findRightMax(int[] array, int size, int index){
        int rightMax = index;
        for(int j=size-1;j>index;j--){
            rightMax = max(rightMax, array[j]);
        }
        return rightMax;
    }
}
