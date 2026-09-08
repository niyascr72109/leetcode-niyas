// Last updated: 9/8/2026, 2:21:25 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap<Integer,Integer> h = new HashMap<>();
4
5        for(int i : nums1){
6            h.put(i,h.getOrDefault(i,0)+1);
7        }
8
9        List<Integer> ans = new LinkedList<>();
10
11        for(int i : nums2){
12            if(h.getOrDefault(i,0) > 0){
13                ans.add(i);
14
15                h.put(i,h.getOrDefault(i,0)-1);                
16            }
17        }
18        int i = 0;
19        int res [] = new int[ans.size()];
20        for(int num : ans){
21            res[i++] = num;
22        }
23        return res;
24    }
25}