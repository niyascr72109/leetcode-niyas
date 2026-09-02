// Last updated: 9/2/2026, 9:57:17 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int max = 0;
4        int l = 0;
5        int r = 0;
6        int zero = 0;
7        int c = 0;
8        while(r<nums.length){
9            if(nums[r]==0){
10                zero++;
11            }
12            while(zero > k){
13                if(nums[l]==0){
14                zero--;
15                }
16                l++;
17            }
18            max=Math.max(max,r-l+1);
19            r++;
20        }
21        return max;
22    }
23}