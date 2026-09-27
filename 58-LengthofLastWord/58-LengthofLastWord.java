// Last updated: 9/27/2026, 9:00:25 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        for(int i=0;i<haystack.length()-needle.length()+1;i++){
4            if(haystack.charAt(i) == needle.charAt(0)){
5                if(haystack.substring(i,needle.length()+i).equals(needle)){
6                    return i;
7                }
8            }
9        }
10        return -1;
11    }
12}