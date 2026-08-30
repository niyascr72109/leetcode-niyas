// Last updated: 8/30/2026, 12:44:52 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int l = 0;
4        int r = 0;
5        int zeros = 0;
6        int max = 0;
7        while(r<nums.length){
8            if(nums[r]==0) zeros++;
9            if(zeros>k){
10                if(nums[l]==0){
11                    zeros--;
12                }
13                l++;
14            }
15            max=Math.max(max,r-l+1);
16            r++;
17        }
18        return max;
19    }
20}