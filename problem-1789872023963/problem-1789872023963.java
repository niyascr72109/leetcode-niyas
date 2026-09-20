// Last updated: 9/20/2026, 8:10:23 AM
1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int c = 0;
4        for(int i=0;i<intervals.length;i++){
5            for(int j=i+1;j<intervals.length;j++){
6                int start1 = intervals[i][0];
7                int end1 = intervals[i][1];
8
9                int start2 = intervals[j][0];
10                int end2 = intervals[j][1];
11
12                if(Math.max(start1,start2)  <= Math.min(end1,end2)){
13                    c++;
14                }
15            }
16        }
17
18        return c;
19    }
20}