// Last updated: 9/8/2026, 2:03:56 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> s = new HashSet<>();
4        for(int n : nums1){
5            s.add(n);
6        }
7
8        HashSet<Integer> ans = new HashSet<>();
9
10        for(int n : nums2){
11            if(s.contains(n)){
12                ans.add(n);
13            }
14        }
15
16        int res[] = new int[ans.size()];
17
18        int i = 0;
19        for(int n : ans){
20            res[i++] = n;
21        }
22        return res;
23    }
24}