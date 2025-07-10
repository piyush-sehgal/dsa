package com.dsa.patterns.sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int pFreq[] = new int[26];
        int sFreq[] = new int[26];
        for(char ch: p.toCharArray()) {
            pFreq[ch - 'a']++;
        }
        int m = p.length();
        for(int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            if(i >= m) {
                sFreq[s.charAt(i - m) - 'a']--;
            }
            if(Arrays.equals(pFreq, sFreq)) {
                res.add(i - m + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        final List<Integer> anagrams = findAnagrams("cbaebabacd", "abc");
        System.out.println(anagrams);
    }
}
