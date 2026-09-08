// Last updated: 9/8/2026, 10:47:49 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k=k%n;
5        rotate(nums,0,n-1);
6        rotate(nums,0,k-1);
7        rotate(nums,k,n-1);
8    }
9
10    void rotate(int nums[],int a,int b){
11        while(a<b){
12            int temp = nums[b];
13            nums[b] = nums[a];
14            nums[a] = temp;
15            a++;
16            b--;
17        }
18    }
19}