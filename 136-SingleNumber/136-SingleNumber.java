// Last updated: 9/18/2026, 10:06:59 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        int evennum = 0;
4        for(int i=0;i<nums.length;i++){
5            int num = nums[i];
6            int len = 0;
7            while(num!=0){
8                num/=10;
9                len++;
10            }
11            if(len%2==0) evennum++;
12        }
13        return evennum;
14    }
15}