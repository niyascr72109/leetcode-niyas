// Last updated: 9/8/2026, 10:23:48 AM
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < nums.length - 2; i++) {
10
11            // Skip duplicate first numbers
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24                    result.add(Arrays.asList(
25                        nums[i],
26                        nums[left],
27                        nums[right]
28                    ));
29
30                    // Skip duplicates
31                    while (left < right && nums[left] == nums[left + 1]) {
32                        left++;
33                    }
34
35                    while (left < right && nums[right] == nums[right - 1]) {
36                        right--;
37                    }
38
39                    left++;
40                    right--;
41
42                } else if (sum < 0) {
43                    left++;
44
45                } else {
46                    right--;
47                }
48            }
49        }
50
51        return result;
52    }
53}