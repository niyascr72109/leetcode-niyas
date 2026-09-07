// Last updated: 9/7/2026, 9:48:17 PM
1import java.util.*;
2class MyStack {
3    Queue<Integer> q;
4    public MyStack() {
5        q = new LinkedList<>();
6    }
7    
8    public void push(int x) {
9        int s = q.size();
10        q.add(x);
11        for(int i=0;i<s;i++){
12            q.add(q.peek());
13            q.poll();
14        }
15    }
16    
17    public int pop() {
18        return q.poll();
19    }
20    
21    public int top() {
22        return q.peek();
23    }
24    
25    public boolean empty() {
26        return q.isEmpty();
27    }
28}
29
30/**
31 * Your MyStack object will be instantiated and called as such:
32 * MyStack obj = new MyStack();
33 * obj.push(x);
34 * int param_2 = obj.pop();
35 * int param_3 = obj.top();
36 * boolean param_4 = obj.empty();
37 */