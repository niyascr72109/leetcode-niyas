// Last updated: 9/7/2026, 10:01:11 PM
1class MyQueue {
2    Stack<Integer> s1;
3    Stack<Integer> s2;
4    public MyQueue() {
5        s1 = new Stack<>();
6        s2 = new Stack<>();
7    }
8    
9    public void push(int x) {
10        if(s1.size()==0){
11            s1.push(x);
12        }
13        else{
14            while(!s1.isEmpty()){
15                s2.push(s1.pop());
16            }
17            s2.push(x);
18            while(!s2.isEmpty()){
19                s1.push(s2.pop());
20            }
21        }
22    }
23    
24    public int pop() {
25        return s1.pop();
26    }
27    
28    public int peek() {
29        return s1.peek();
30    }
31    
32    public boolean empty() {
33        return s1.isEmpty();
34    }
35}
36
37/**
38 * Your MyQueue object will be instantiated and called as such:
39 * MyQueue obj = new MyQueue();
40 * obj.push(x);
41 * int param_2 = obj.pop();
42 * int param_3 = obj.peek();
43 * boolean param_4 = obj.empty();
44 */