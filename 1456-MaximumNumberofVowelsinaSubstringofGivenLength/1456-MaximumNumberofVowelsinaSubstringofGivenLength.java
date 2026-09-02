// Last updated: 9/2/2026, 9:18:07 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int mul = 1;
4        int l = 0;
5        int r = 0;
6        int c = 0;
7        while(r<nums.length){
8            mul*=nums[r];
9            while(mul > k){
10                mul/=nums[l];
11                l++;
12            }
13            if(mul < k){
14                c+=r-l+1;
15            }
16            r++;
17
18        }
19        return c;
20    }
21}