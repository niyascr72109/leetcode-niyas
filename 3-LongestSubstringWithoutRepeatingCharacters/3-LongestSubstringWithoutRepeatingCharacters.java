// Last updated: 9/27/2026, 1:01:43 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        int ascii_s = 0;
4        int ascii_t = 0;
5        for(char ch : s.toCharArray()){
6            ascii_s+=ch;
7        }
8
9        for(char ch : t.toCharArray()){
10            ascii_t+=ch;
11        }
12
13        char ch = (char)Math.abs(ascii_s-ascii_t);
14        return ch;
15    }
16}