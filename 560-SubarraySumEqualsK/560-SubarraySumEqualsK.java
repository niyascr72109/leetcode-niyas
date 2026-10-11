// Last updated: 10/11/2026, 10:22:05 AM
1
2class Solution {
3    public int subarraySum(int[] nums, int k) {
4        int sum = 0;
5        int count = 0;
6
7        HashMap<Integer, Integer> h = new HashMap<>();
8        h.put(0, 1);
9
10        for (int i = 0; i < nums.length; i++) {
11            sum += nums[i];
12
13            int x = sum - k;
14
15            if (h.containsKey(x)) {
16                count += h.get(x);
17            }
18
19            h.put(sum, h.getOrDefault(sum, 0) + 1);
20        }
21
22        return count;
23    }
24}
25