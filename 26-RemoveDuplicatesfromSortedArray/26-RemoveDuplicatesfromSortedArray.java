// Last updated: 10/1/2026, 9:16:08 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int i=0;
4        for(int j=1;j<nums.length;j++){
5            if(nums[j]!=nums[i]){
6                nums[i+1]=nums[j];
7                i++;
8            }
9        }
10        return i+1;
11    }
12}