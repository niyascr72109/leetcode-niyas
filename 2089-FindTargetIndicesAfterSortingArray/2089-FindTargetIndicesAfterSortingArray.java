// Last updated: 10/19/2026, 8:50:27 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        List<Integer> l = new ArrayList<>();
4        Arrays.sort(nums);
5        for(int i=0;i<nums.length;i++){
6            if(nums[i] == target) l.add(i);
7        }
8        return l;
9    }
10}