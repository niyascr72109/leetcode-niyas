// Last updated: 9/27/2026, 12:50:37 PM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        Arrays.sort(strs);
4        String longest = "";
5        String f = strs[0];
6        String l = strs[strs.length-1];
7        int ind = 0;
8        while(ind < f.length()){
9            if(f.charAt(ind) == l.charAt(ind)){
10                longest+=f.charAt(ind);
11                ind++;
12            }
13            else break;
14        }
15        return longest;
16    }
17}