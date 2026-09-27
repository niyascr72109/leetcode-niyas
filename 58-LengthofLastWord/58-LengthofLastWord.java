// Last updated: 9/27/2026, 9:13:25 AM
1class Solution {
2    public String reverseWords(String s) {
3        String str[] = s.split(" +");
4        StringBuilder sb = new StringBuilder();
5        for(int i=str.length-1;i>=0;i--){
6            sb.append(str[i]+" ");
7        }
8
9        return sb.toString().trim();
10    }
11}