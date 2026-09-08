// Last updated: 9/8/2026, 10:20:41 AM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8
9            // Make mid even
10            if (mid % 2 == 1) {
11                mid--;
12            }
13
14            // Pair is correct: nums[mid] == nums[mid + 1]
15            if (nums[mid] == nums[mid + 1]) {
16                low = mid + 2;
17            } 
18            else {
19                high = mid;
20            }
21        }
22
23        return nums[low];
24    }
25}