// Last updated: 8/30/2026, 10:08:55 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int l = 0;
4        int r = 0;
5        Map<Character,Integer> m = new HashMap<>();
6        int longest = 0;
7        while(r < s.length()){
8            if(m.containsKey(s.charAt(r))){
9                l=Math.max(l,m.get(s.charAt(r))+1);
10                m.put(s.charAt(r),r);
11            }
12            m.put(s.charAt(r),r);
13            r++;
14            longest=Math.max(longest,r-l);
15        }
16        return longest;
17    }
18}