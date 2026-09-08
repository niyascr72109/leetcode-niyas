// Last updated: 9/8/2026, 10:25:33 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int k = 0;
4
5        for (int num : nums) {
6            if (k < 2 || num != nums[k - 2]) {
7                nums[k] = num;
8                k++;
9            }
10        }
11
12        return k;
13    }
14}