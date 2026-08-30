// Last updated: 8/30/2026, 6:26:39 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int l = 0;
5        int r = 0;
6        int longest = 0;
7        while(r<nums.length){
8            while(nums[r]-nums[l]>1){
9                l++;
10            }
11            if(nums[r]-nums[l]==1){
12                longest=Math.max(longest,r-l+1);
13            }
14            r++;
15        }
16        return longest;
17    }
18}