// Last updated: 9/2/2026, 8:07:38 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int l = 0;
4        int r = 0;
5        int sum = 0;
6        int min = Integer.MAX_VALUE;
7        while(r<nums.length){
8            sum += nums[r];
9            while(sum >= target){
10                min=Math.min(min,r-l+1);
11                sum-= nums[l];
12                l++;
13            }
14            r++;
15        }
16        return min==Integer.MAX_VALUE ? 0 : min;
17    }
18}