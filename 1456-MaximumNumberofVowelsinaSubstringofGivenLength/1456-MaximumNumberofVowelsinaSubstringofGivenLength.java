// Last updated: 9/3/2026, 11:37:32 AM
1class Solution {
2    public int countKConstraintSubstrings(String s, int k) {
3        int l = 0;
4        int r = 0;
5        int c = 0;
6        int one = 0;
7        int zero = 0;
8        while(r<s.length()){
9            if(s.charAt(r)=='0') zero++;
10            if(s.charAt(r)=='1') one++;
11
12            while(zero > k && one > k){
13                if(s.charAt(l) == '0'){
14                    zero--;
15                }
16                else one--;
17                l++;
18            }
19            c+=r-l+1;
20            r++;
21            
22        }
23        return c;
24    }
25}