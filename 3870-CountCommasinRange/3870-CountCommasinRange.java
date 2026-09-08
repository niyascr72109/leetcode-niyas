// Last updated: 9/8/2026, 10:05:42 AM
1class Solution {
2    public int countCommas(int n) {
3        int digit = n - 999;
4        if(digit > 0){
5            return digit;
6        }
7        else{
8            return 0;
9        }
10        
11    }
12}