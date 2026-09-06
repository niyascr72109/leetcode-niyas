// Last updated: 9/6/2026, 8:58:08 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer,Integer> m = new HashMap<>();
4        Stack<Integer> st = new Stack<>();
5        for(int ele : nums2){
6            while(!st.isEmpty() && ele > st.peek()){
7                m.put(st.pop(),ele);
8            }
9            st.push(ele);
10        }
11        int[] res = new int[nums1.length];
12        for(int i=0;i<nums1.length;i++){
13            res[i] = m.getOrDefault(nums1[i],-1);
14        }
15        return res;
16    }
17}