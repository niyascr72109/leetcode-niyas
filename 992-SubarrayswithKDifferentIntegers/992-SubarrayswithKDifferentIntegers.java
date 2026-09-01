// Last updated: 9/1/2026, 9:16:09 PM
1class Solution {
2    private int fun(int[] nums, int k){
3        int l = 0;
4        int r = 0;
5        int c = 0;
6        HashMap<Integer,Integer> h = new HashMap<>();
7        while(r<nums.length){
8            h.put(nums[r],h.getOrDefault(nums[r],0)+1);
9            while(h.size() > k){
10                h.put(nums[l],h.getOrDefault(nums[l],0)-1);
11                if(h.get(nums[l])==0) h.remove(nums[l]);
12                l++;
13            }
14            c+=r-l+1;
15            r++;
16        }
17        return c;
18    }
19    public int subarraysWithKDistinct(int[] nums, int k) {
20        return fun(nums,k) - fun(nums,k-1);
21    }
22}