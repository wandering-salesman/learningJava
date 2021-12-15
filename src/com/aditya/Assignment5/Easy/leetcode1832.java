package com.aditya.Assignment5.Easy;

import java.util.Arrays;

public class leetcode1832 {
    public static void main(String[] args) {
        String sentence = "nymphsblitzquickvexdwarfjog";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        int[] count = new int[26];
        Arrays.fill(count, -1);
        for(int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)-97 >= 0 && sentence.charAt(i)-122 <=0) {
                count[sentence.charAt(i)-97] = 0;
            }
        }
        for(int i : count) {
            if(i == -1) {
                return false;
            }
        }
        return true;
    }
}
