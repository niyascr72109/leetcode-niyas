// Last updated: 9/2/2026, 8:30:20 PM
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int sum = 0;
4        int c = 0;
5
6        for(int i=0;i<k;i++){
7            sum+=arr[i];
8        }
9
10        if(sum >= threshold * k){
11            c+=1;
12        }
13
14        for(int i=k;i<arr.length;i++){
15            sum+=arr[i];
16            sum-=arr[i-k];
17
18            if(sum >= threshold * k){
19                c++;
20            }
21        }
22        return c;
23    }
24}