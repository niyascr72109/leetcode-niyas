// Last updated: 9/1/2026, 3:19:41 PM
1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int c = 0;
4        int sum = 0;
5        for(int i=0;i<k;i++){
6            sum+=arr[i];
7        }
8        if(sum >= threshold*k ){
9            c++;
10        }
11
12        for(int i=k;i<arr.length;i++){
13            
14            sum-=arr[i-k];
15            sum+=arr[i];
16            if(sum >= threshold*k ){
17                c++;
18            }
19        }
20        return c;
21    }
22}