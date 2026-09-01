// Last updated: 9/1/2026, 3:41:23 PM
1class Solution {
2    public boolean vowels(char c){
3        return c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u';
4    }
5    public int maxVowels(String s, int k) {
6        int v = 0;
7        for(int i=0;i<k;i++){
8            if(vowels(s.charAt(i))){
9                v++;
10            }
11        }
12
13        int max = v;
14
15        for(int i=k;i<s.length();i++){
16            if(vowels(s.charAt(i))){
17                v++;
18            }
19            if(vowels(s.charAt(i-k))){
20                v--;
21            }
22            max=Math.max(max,v);
23        }
24        return max;
25
26
27    }
28}