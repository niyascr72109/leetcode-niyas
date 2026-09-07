// Last updated: 9/7/2026, 3:02:49 PM
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n = nums.length;
4        int k = n/2;
5        long total=0;
6        long windowSum=0;
7        int c=0;
8
9        for(int x : nums)
10        {
11            total+=x;
12        }
13        for(int i=0;i<k;i++)
14        {
15            windowSum+=nums[i];
16        }
17        for(int i=k;i<n+k;i++)
18        {
19            windowSum-=nums[i-k];
20            windowSum+=nums[i%n];
21
22            if(windowSum*2 > total)
23            {
24                c++;
25            }
26        }
27        return (int)c;
28    }
29}