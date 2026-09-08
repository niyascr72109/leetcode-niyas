// Last updated: 9/8/2026, 10:21:39 AM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int low = 1;
4        int high = 0;
5
6        for (int pile : piles) {
7            high = Math.max(high, pile);
8        }
9
10        while (low < high) {
11            int mid = low + (high - low) / 2;
12
13            long hours = 0;
14
15            for (int pile : piles) {
16                hours += (pile + mid - 1) / mid;
17            }
18
19            if (hours <= h) {
20                high = mid;
21            } else {
22                low = mid + 1;
23            }
24        }
25
26        return low;
27    }
28}