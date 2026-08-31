// Last updated: 8/31/2026, 10:41:39 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int freq[] = new int[26];
4        int l = 0;
5        int r = 0;
6        int maxfreq = 0;
7        int maxlen = 0;
8        while(r<s.length()){
9            freq[s.charAt(r)-'A']++;
10            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);
11            if((r-l+1) - maxfreq > k){
12                freq[s.charAt(l)-'A']--;
13                l++;
14            }
15            if((r-l+1) - maxfreq <= k){
16                maxlen=Math.max(maxlen,r-l+1);
17            }
18            r++;
19        }
20        return maxlen;
21    }
22}