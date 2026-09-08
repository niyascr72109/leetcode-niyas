// Last updated: 9/8/2026, 10:31:19 AM
1import java.util.*;
2
3class Solution {
4    public boolean checkInclusion(String s1, String s2) {
5        if (s1.length() > s2.length()) {
6            return false;
7        }
8
9        int[] freq1 = new int[26];
10        int[] freq2 = new int[26];
11
12        int k = s1.length();
13
14        // Count characters in s1
15        for (char c : s1.toCharArray()) {
16            freq1[c - 'a']++;
17        }
18
19        // Sliding window in s2
20        for (int right = 0; right < s2.length(); right++) {
21
22            freq2[s2.charAt(right) - 'a']++;
23
24            // Keep window size = s1.length()
25            if (right >= k) {
26                freq2[s2.charAt(right - k) - 'a']--;
27            }
28
29            // Check if window is a permutation
30            if (Arrays.equals(freq1, freq2)) {
31                return true;
32            }
33        }
34
35        return false;
36    }
37}