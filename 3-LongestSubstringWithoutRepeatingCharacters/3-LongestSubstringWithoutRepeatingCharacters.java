// Last updated: 8/30/2026, 10:53:41 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        
4        int l = 0;
5        int r = 0;
6        int arr[] = new int[256];
7        Arrays.fill(arr,-1);
8        int longest = 0;
9        while(r<s.length()){
10            if(arr[s.charAt(r)]!=-1){
11                l=Math.max(l,arr[s.charAt(r)]+1);
12            }
13            longest=Math.max(longest,r-l+1);
14            arr[s.charAt(r)] = r;
15            r++;
16        }
17        return longest;
18    }
19}