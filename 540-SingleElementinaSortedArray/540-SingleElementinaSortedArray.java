// Last updated: 9/8/2026, 10:34:42 AM
1class Solution {
2    public int numSubarraysWithSum(int[] nums, int goal) {
3        return atMost(nums, goal) - atMost(nums, goal - 1);
4    }
5
6    private int atMost(int[] nums, int goal) {
7
8        if (goal < 0) {
9            return 0;
10        }
11
12        int left = 0;
13        int sum = 0;
14        int count = 0;
15
16        for (int right = 0; right < nums.length; right++) {
17
18            sum += nums[right];
19
20            while (sum > goal) {
21                sum -= nums[left];
22                left++;
23            }
24
25            count += right - left + 1;
26        }
27
28        return count;
29    }
30}