// Last updated: 9/17/2026, 7:18:58 PM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> st = new Stack<>();
4        for (int i = 0; i < operations.length; i++) {
5            if (operations[i].equals("C")) {
6                st.pop();
7            }
8            else if (operations[i].equals("D")) {
9                int x = st.peek() * 2;
10                st.push(x);
11            }
12            else if (operations[i].equals("+")) {
13                int a = st.pop();
14                int b = st.peek();
15                st.push(a);
16                st.push(a + b);
17            }
18            else {
19                st.push(Integer.parseInt(operations[i]));
20            }
21        }
22
23        int ans = 0;
24
25        while (!st.isEmpty()) {
26            ans += st.pop();
27        }
28
29        return ans;
30    }
31}