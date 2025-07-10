package com.dsa.patterns.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> innerList = new ArrayList<Integer>();
        helper(nums, 0, nums.length, target, 0, innerList, res);
        return res;
    }

    private static void helper(int[] arr, int i, int n, int target, int sum, List<Integer> innerList, List<List<Integer>> res) {
        if(i == n || sum >= target) {
            if(sum == target) {
                res.add(new ArrayList<>(innerList));
                return;
            }
            return;
        }
        innerList.add(arr[i]);
        helper(arr, i, n, target, sum + arr[i], innerList, res);
        innerList.remove(innerList.size() - 1);
        helper(arr, i + 1, n, target, sum, innerList, res);
    }

    public static void main(String[] args) {
        combinationSum(new int[]{2,3,6,7}, 7);
    }
}
