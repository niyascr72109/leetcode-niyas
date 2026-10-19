// Last updated: 10/19/2026, 10:21:27 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int res[] = new int[nums.length];
4        int pos = 0;
5        int neg = 1;
6        for(int i=0;i<nums.length;i++){
7            if(nums[i] < 0){
8                res[neg] = nums[i];
9                neg+=2;
10            }
11            else{
12                res[pos] = nums[i];
13                pos+=2;
14            }
15        }
16        return res;
17    }
18}