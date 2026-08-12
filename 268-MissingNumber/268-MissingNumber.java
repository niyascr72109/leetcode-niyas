// Last updated: 8/12/2026, 10:13:27 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int maxi = nums[0];
6        for(int i=0;i<n;i++){
7            sum+=nums[i];
8            if(sum > maxi) maxi = sum;
9            if(sum < 0) sum = 0;
10        }
11        return maxi;
12    }
13}