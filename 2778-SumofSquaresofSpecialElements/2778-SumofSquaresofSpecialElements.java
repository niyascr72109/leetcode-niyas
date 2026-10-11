// Last updated: 10/11/2026, 9:12:01 AM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int res = 0;
4        for(int i=1;i<=nums.length;i++){
5            if(nums.length % i ==0) res+=nums[i-1]*nums[i-1];
6        }
7        return res;
8    }
9}