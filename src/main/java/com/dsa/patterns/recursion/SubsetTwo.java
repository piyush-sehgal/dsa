package com.dsa.patterns.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SubsetTwo {
    static void subsetTwo(int[] arr, int i, int n, List<Integer> partialRes, Set<String> res) {
        if(i == n) {
            res.add(partialRes.toString());
            return;
        }
        partialRes.add(arr[i]);
        subsetTwo(arr, i + 1, n, partialRes, res);
        partialRes.remove(partialRes.size() - 1);
        subsetTwo(arr, i + 1, n, partialRes, res);
    }

    //pass sorted array in order to avoid duplicates
    static void subsetTwoLC(int []arr, int i, int n, List<Integer> partialRes, List<List<Integer>> res) {
        if(i == n) {
            res.add(new ArrayList<Integer>(partialRes));
            return;
        }
        partialRes.add(arr[i]);
        subsetTwoLC(arr, i + 1, n, partialRes, res);
        partialRes.remove(partialRes.size() - 1);
        while(i + 1 < n && arr[i] == arr[i + 1]) {
            i += 1;
        }
        subsetTwoLC(arr, i + 1, n, partialRes, res);
    }
}
