// Last updated: 8/31/2026, 4:28:37 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int l = 0;
5        for(int i=0;i<n;i++){
6            if(nums[i]!=0){
7                int temp = nums[l];
8                nums[l]=nums[i];
9                nums[i] = temp;
10                l++;
11            }
12            }
13        }
14    }
15