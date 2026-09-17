// Last updated: 9/17/2026, 10:17:22 PM
1class Solution {
2    public int[] asteroidCollision(int[] asteroids) {
3        Stack<Integer> st = new Stack<>();
4        for(int i=0;i<asteroids.length;i++){
5            boolean destroid = false;
6            while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0 && st.peek() + asteroids[i] <= 0){
7                if(asteroids[i] + st.peek() < 0){
8                    st.pop();
9                }
10                else{
11                    st.pop();
12                    destroid = true;
13                    break;
14                }
15            }
16            if(!destroid){
17                if(st.isEmpty() || asteroids[i] >0 || st.peek() < 0) st.push(asteroids[i]);
18            }
19        }
20        int []res = new int[st.size()];
21        for(int i=0;i<st.size() ; i++){
22            res[i] = st.get(i);
23        }
24        return res;
25    }
26}