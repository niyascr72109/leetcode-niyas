// Last updated: 8/16/2026, 9:09:46 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int max = 0;
4        for(int light : lights) max = Math.max(max,light);
5
6        int ans = 0;
7        for(int time : arrivalTime){
8            int r = time % period;
9            int wait;
10            if(r < max){
11                wait = 0;
12            }
13            else {
14                wait = period - r;
15            }
16            ans = Math.max(ans , wait);
17        }
18        return ans;
19    }
20}