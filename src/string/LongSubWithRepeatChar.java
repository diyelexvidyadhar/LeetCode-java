package string;/*
Created by : Vidyadhar Jogi
Date : 29-06-2021
Problem link : https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/

public class LongSubWithRepeatChar {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)])
                    break;
                else {
                    result = Math.max(result, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        return result;
    }
}
