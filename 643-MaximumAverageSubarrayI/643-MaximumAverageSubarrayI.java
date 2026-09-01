// Last updated: 9/1/2026, 3:03:36 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int sum = 0;
4        for(int i=0;i<k;i++){
5            sum += nums[i];
6        }
7
8        int max = sum;
9
10        for(int i=k;i<nums.length;i++){
11            sum-=nums[i-k];
12            sum+=nums[i];
13            max=Math.max(max,sum);
14        }
15        return (double) max / k;
16        
17    }
18}