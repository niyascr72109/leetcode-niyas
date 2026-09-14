// Last updated: 9/14/2026, 6:01:47 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int nge[] = new int[n];
5        Stack<Integer> st = new Stack<>();
6        for(int i=2*n-1;i>=0;i--){
7            while(!st.isEmpty() && nums[i%n] >= st.peek()){
8                st.pop();
9            }
10            if(i<n){
11                nge[i] = st.isEmpty() ? -1 : st.peek();
12            }
13            st.push(nums[i%n]);
14        }
15        return nge;
16    }
17}