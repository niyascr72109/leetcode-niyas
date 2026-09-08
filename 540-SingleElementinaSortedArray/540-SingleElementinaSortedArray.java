// Last updated: 9/8/2026, 10:28:58 AM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findAnagrams(String s, String p) {
5        List<Integer> result = new ArrayList<>();
6
7        int[] pFreq = new int[26];
8        int[] windowFreq = new int[26];
9
10        int k = p.length();
11
12        // Frequency of p
13        for (char c : p.toCharArray()) {
14            pFreq[c - 'a']++;
15        }
16
17        // Sliding window
18        for (int right = 0; right < s.length(); right++) {
19
20            windowFreq[s.charAt(right) - 'a']++;
21
22            // Keep window size equal to p.length()
23            if (right >= k) {
24                windowFreq[s.charAt(right - k) - 'a']--;
25            }
26
27            // Compare frequencies
28            if (Arrays.equals(pFreq, windowFreq)) {
29                result.add(right - k + 1);
30            }
31        }
32
33        return result;
34    }
35}