// Last updated: 8/12/2026, 9:23:13 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        int n = nums.length;
4        int sum = n*(n+1)/2;
5        int news= 0;
6        for(int i = 0;i<nums.length;i++){
7            news+=nums[i];
8        }
9    return sum-news;}
10}