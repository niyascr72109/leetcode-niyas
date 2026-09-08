// Last updated: 9/8/2026, 10:27:46 AM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freq = new int[26];
4
5        int left = 0;
6        int maxFreq = 0;
7        int maxLength = 0;
8
9        for (int right = 0; right < s.length(); right++) {
10
11            freq[s.charAt(right) - 'A']++;
12
13            maxFreq = Math.max(maxFreq,
14                    freq[s.charAt(right) - 'A']);
15
16            int windowLength = right - left + 1;
17
18            int changes = windowLength - maxFreq;
19
20            if (changes > k) {
21                freq[s.charAt(left) - 'A']--;
22                left++;
23            }
24
25            maxLength = Math.max(maxLength, right - left + 1);
26        }
27
28        return maxLength;
29    }
30}