// Last updated: 9/6/2026, 9:02:22 AM
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n = nums.length;
4        int k = n/2;
5        long total = 0;
6        int arr[] = nums;
7
8        for(int i=0;i<n;i++) total += arr[i];
9
10        long f = 0;
11
12        for(int i=0;i<k;i++) f += arr[i];
13
14        int c = 0;
15
16        for(int i=0;i<n;i++){
17            if(f > total - f){
18                c++;
19            }
20
21            int in = arr[(i+k)%n];
22            int out = arr[i];
23
24            f=f-out+in;
25        }
26        return c;
27    }
28}