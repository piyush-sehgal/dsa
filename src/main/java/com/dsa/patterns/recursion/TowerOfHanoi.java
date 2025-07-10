package com.dsa.patterns.recursion;

public class TowerOfHanoi {

    public static void toh(int n, String a, String b, String c) {
        if(n == 0) return;
        toh(n -1, a, c, b);
        System.out.println("Move: " + n + " from " + a + " to " + b);
        toh(n -1, c, b, a);
    }
}
