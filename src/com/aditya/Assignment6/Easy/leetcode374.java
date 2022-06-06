package com.aditya.Assignment6.Easy;
public class leetcode374 {
    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     * int guess(int num);
     */
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int guessed = guess(mid);
            if (guessed == -1)
                end = mid - 1;
            else if (guessed == 1)
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
    int guess(int x) {
        if(x < 5)
            return 1;
        else if(x > 5)
            return -1;
        else
            return 0;

    }
}
