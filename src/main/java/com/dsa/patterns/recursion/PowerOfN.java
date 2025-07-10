package com.dsa.patterns.recursion;

public class PowerOfN {

    public static int powerOfN(int x, int n) {
        if(n == 0) return 1;
        int firstHalf = powerOfN(x, n /2);
        int secondHalf = powerOfN(x, n/2);
        int res = firstHalf * secondHalf;
        return n % 2 == 0 ? res : res * x;
    }
}
