// Last updated: 9/1/2026, 8:14:51 PM
1class Solution {
2    private int nice(int[] nums, int k){
3        int l = 0;
4        int r = 0;
5        int c = 0;
6        int sum = 0;
7        while(r<nums.length){
8            sum += nums[r]%2;
9            while(sum > k){
10                sum-=nums[l]%2;
11                l++;
12            }
13            c+=r-l+1;
14            r++;
15        }
16        return c;
17    }
18    public int numberOfSubarrays(int[] nums, int k) {
19        return nice(nums,k) - nice(nums,k-1);
20    }
21}