// Last updated: 9/27/2026, 9:22:31 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int l = 0;
4        int r = s.length()-1;
5        s=s.toLowerCase();
6        while(l<r){
7            if(!Character.isLetterOrDigit(s.charAt(l))){
8                l++;
9            }
10
11            else if(!Character.isLetterOrDigit(s.charAt(r))){
12                r--;
13            }
14            else if(s.charAt(l) != s.charAt(r)){
15                return false;
16            }
17            else{
18                l++;
19                r--;
20            }
21        }
22        return true;
23    }
24}