// Last updated: 9/14/2026, 6:59:47 PM
1class Solution {
2    public int trap(int[] height) {
3        int lmax = 0;
4        int rmax = 0;
5        int t = 0;
6        int l = 0;
7        int r = height.length-1;
8        while(l<r){
9            if(height[l] <= height[r]){
10                if(height[l] < lmax){
11                    t+=lmax - height[l];
12                }
13                else lmax = height[l];
14                l++;
15            }
16            else{
17                if(height[r] < rmax){
18                    t+=rmax - height[r];
19                }
20                else rmax = height[r];
21                r--;
22            }
23        }
24        return t;
25    }
26}