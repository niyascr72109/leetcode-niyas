// Last updated: 8/31/2026, 11:20:59 PM
1class Solution {
2    public static int sum(int[] nums, int goal){
3        if(goal < 0) return 0;
4        int l = 0;
5        int r = 0;
6        int sum = 0;
7        int c = 0;
8        while(r < nums.length){
9            sum+=nums[r];
10            
11
12            while(sum > goal){
13                sum-=nums[l];
14                l++;
15            }
16
17            c+=r-l+1;
18            r++;
19        }
20        return c;
21    }
22    public int numSubarraysWithSum(int[] nums, int goal) {
23        return sum(nums,goal) - sum(nums,goal-1);
24    }
25}