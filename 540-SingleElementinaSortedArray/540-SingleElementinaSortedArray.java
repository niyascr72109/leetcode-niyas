// Last updated: 9/8/2026, 10:22:49 AM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int max = 0;
6
7        while (left < right) {
8            int width = right - left;
9            int h = Math.min(height[left], height[right]);
10
11            int area = width * h;
12            max = Math.max(max, area);
13
14            if (height[left] < height[right]) {
15                left++;
16            } else {
17                right--;
18            }
19        }
20
21        return max;
22    }
23}