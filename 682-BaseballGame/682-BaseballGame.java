// Last updated: 9/17/2026, 7:45:42 PM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3
4        Stack<Character> st = new Stack<>();
5        Stack<Character> tt = new Stack<>();
6
7        for(char ch : s.toCharArray()) {
8            if(ch == '#') {
9                if(!st.isEmpty()) {
10                    st.pop();
11                }
12            }
13            else {
14                st.push(ch);
15            }
16        }
17
18        for(char ch : t.toCharArray()) {
19            if(ch == '#') {
20                if(!tt.isEmpty()) {
21                    tt.pop();
22                }
23            }
24            else {
25                tt.push(ch);
26            }
27        }
28
29        return st.equals(tt);
30    }
31}