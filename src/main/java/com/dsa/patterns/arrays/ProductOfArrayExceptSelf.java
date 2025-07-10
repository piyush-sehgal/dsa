package com.dsa.patterns.arrays;

public class ProductOfArrayExceptSelf {

    /**
     * TC: O(n)
     * SC: O(n) -> left and right prefix multiplication array
     * */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int curr = 1;
        for(int i = 0; i < n; i++) {
            res[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        return res;
    }

    /**
     * TC: O(n)
     * SC: O(1)
     * */
    public int[] productExceptSelfSpaceOptimized(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int curr = 1;
        for(int i = 0; i < n; i++) {
            res[i] = curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= curr;
            curr *= nums[i];
        }
        return res;
    }
}
