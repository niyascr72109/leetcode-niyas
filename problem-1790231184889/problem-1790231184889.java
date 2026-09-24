// Last updated: 9/24/2026, 11:56:24 AM
1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int sum = 0;
5            int num = nums[i];
6            while(num!=0){
7                int d = num%10;
8                sum+=d;
9                num/=10;
10            }
11            if(sum==i) return i;
12        }
13        return -1;
14    }
15}