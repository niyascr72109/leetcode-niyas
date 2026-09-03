// Last updated: 9/3/2026, 11:08:09 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> h = new HashSet<>();
4        int l = 0;
5        int r = 0;
6        while(r<nums.length){
7            if(h.contains(nums[r])){
8                return true;
9            }
10
11            h.add(nums[r]);
12
13            if(h.size() > k){
14                h.remove(nums[r-k]);
15                l++;
16            }
17            r++;
18        }
19        return false;
20    }
21}