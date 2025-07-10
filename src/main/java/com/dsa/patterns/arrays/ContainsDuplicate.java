package com.dsa.patterns.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val: nums) {
            if(!set.contains(val)) {
                set.add(val);
            } else {
                return true;
            }
        }
        return false;
    }
}
