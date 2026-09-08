// Last updated: 9/8/2026, 10:30:41 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int left = 0;
4        int sum = 0;
5        int minLength = Integer.MAX_VALUE;
6
7        for (int right = 0; right < nums.length; right++) {
8
9            sum += nums[right];
10
11            while (sum >= target) {
12                minLength = Math.min(minLength, right - left + 1);
13
14                sum -= nums[left];
15                left++;
16            }
17        }
18
19        return minLength == Integer.MAX_VALUE ? 0 : minLength;
20    }
21}