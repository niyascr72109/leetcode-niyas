// Last updated: 9/2/2026, 9:01:12 PM
1class Solution {
2    public boolean vowels(char c){
3        return c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u';
4    }
5    public int maxVowels(String s, int k) {
6        int v = 0;
7        int max = 0;
8        for(int i=0;i<k;i++){
9            if(vowels(s.charAt(i))){
10                v++;
11            }
12        }
13
14        max = v;
15
16        for(int i=k;i<s.length();i++){
17            if(vowels(s.charAt(i))) v++;
18            if(vowels(s.charAt(i-k))) v--;
19
20            max=Math.max(max,v);
21        }
22        return max;
23    }
24}