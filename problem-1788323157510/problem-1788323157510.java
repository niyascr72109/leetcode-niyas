// Last updated: 9/2/2026, 9:55:57 AM
1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        long sum = 0;
4        HashMap<Integer,Integer> h = new HashMap<>();
5        for(int i=0;i<k;i++){
6            sum+=nums[i];
7            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
8        }
9        long max = 0;
10        
11        if(h.size() == k){
12            max=sum;
13        }
14
15        for(int i=k;i<nums.length;i++){
16            sum+=nums[i];
17            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
18            
19            sum-=nums[i-k];
20            h.put(nums[i-k],h.getOrDefault(nums[i-k],0)-1);
21
22            if(h.get(nums[i-k])==0) h.remove(nums[i-k]);
23
24            if(h.size() == k) max=Math.max(max,sum);
25            
26        }
27        return max;
28    }
29}