// Last updated: 8/31/2026, 3:36:44 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1) return 0;
4        int l = 0;
5        int r = 0;
6        int product = 1;
7        int c = 0;
8        while(r<nums.length){
9            product*=nums[r];
10            while(product >= k){
11                product /= nums[l];
12                l++;
13            }
14            c+=r-l+1;
15            r++;
16        }
17        return c;
18    }
19}
20