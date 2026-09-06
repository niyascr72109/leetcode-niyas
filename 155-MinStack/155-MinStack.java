// Last updated: 9/6/2026, 6:04:46 PM
1class MinStack {
2    Stack<Long> st;
3    long min;
4
5    public MinStack() {
6        st = new Stack<>();
7        min = Long.MAX_VALUE;
8    }
9
10    public void push(int value) {
11        long val = value;
12
13        if (st.isEmpty()) {
14            st.push(val);
15            min = val;
16        } 
17        else if (val >= min) {
18            st.push(val);
19        } 
20        else {
21            long ele = 2 * val - min;
22            st.push(ele);
23            min = val;
24        }
25    }
26
27    public void pop() {
28        if (st.isEmpty()) return;
29
30        long x = st.pop();
31
32        if (x < min) {
33            min = 2 * min - x;
34        }
35    }
36
37    public int top() {
38        if (st.isEmpty()) return -1;
39
40        long x = st.peek();
41
42        if (x < min) {
43            return (int) min;
44        } 
45        else {
46            return (int) x;
47        }
48    }
49
50    public int getMin() {
51        return (int) min;
52    }
53}