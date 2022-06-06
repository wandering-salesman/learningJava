package com.aditya.Assignment6.Easy;

public class leetcode278 {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end) {
            int mid = start + (end - start)/2;
            boolean currentVersionState = isBadVersion(mid);
            if(currentVersionState)
                end = mid - 1;
            else if(!currentVersionState)
                start = mid + 1;
        }
        return start;
    }

    private boolean isBadVersion(int mid) {
        int rando = (int) (10 * Math.random());
        return rando < 5;
    }
}
