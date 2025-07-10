package com.dsa.patterns.recursion;

import java.util.ArrayList;
import java.util.List;

import static com.dsa.patterns.recursion.SubsetTwo.subsetTwoLC;


public class RecursionRunner {
    public static void main(String[] args) {
        //pzz(1);
        //reverse(new int[]{1,2,3,4,5}, 0);
        //int res = powerOfN(2, 4);
        //toh(4, "A", "B", "C");
        int[] arr = {1,2,2,3};
        //subsetSum(arr);
        List<Integer> partialList = new ArrayList<Integer>();
        //Set<String> resList =new HashSet<String>();
        //subsetTwo(arr, 0, arr.length, partialList, resList);
//        for(String s: resList) {
//            System.out.println(s);
//        }
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        subsetTwoLC(arr, 0, arr.length, partialList, resList);
        for(List<Integer> res: resList) {
            System.out.println(res.toString());
        }

        //System.out.println(res);
    }
}
