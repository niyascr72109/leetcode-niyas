// Last updated: 8/29/2026, 10:15:31 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int lsum = 0;
4        int rsum = 0;
5        int n = cardPoints.length;
6        for(int i=0;i<k;i++){
7            lsum+=cardPoints[i];
8        }
9        int max = lsum;
10        int r = n-1;
11        for(int i=k-1;i>=0;i--){
12            lsum-=cardPoints[i];
13            rsum+=cardPoints[r];
14            r--;
15            max=Math.max(max,lsum+rsum);
16        }
17        return max;
18    }
19}