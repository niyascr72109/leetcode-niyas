// Last updated: 9/16/2026, 9:28:21 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        HashMap<Integer,Integer> h = new HashMap<>();
4        int m = 0;
5        for(int i=0;i<nums.length;i++){
6            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
7        }
8        int r = 0;
9        for(int key : h.keySet()){
10            if(h.get(key) > m){
11                m = h.get(key);
12                r = key;
13            }
14        }
15        return r;
16    }
17}