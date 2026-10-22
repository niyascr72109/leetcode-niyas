// Last updated: 10/22/2026, 12:28:22 PM
1class Solution {
2    static void swap(int nums[],int a,int b){
3        int temp = nums[a];
4        nums[a] = nums[b];
5        nums[b] = temp;
6    }
7    static void reverse(int nums[],int a,int b){
8        while(a<b){
9            int temp = nums[a];
10            nums[a] = nums[b];
11            nums[b] = temp;
12            a++;
13            b--;
14        }
15    }
16
17
18    public void nextPermutation(int[] nums) {
19        int ind = -1;
20        for(int i=nums.length-2;i>=0;i--){
21            if(nums[i+1] > nums[i]){
22                ind = i;
23                break;
24            }
25        }
26
27        if (ind == -1) {
28            reverse(nums, 0, nums.length - 1);
29            return;
30        }
31
32
33        for(int i=nums.length-1;i>ind;i--){
34            if(nums[i] > nums[ind]){
35                swap(nums,ind,i);
36                break;
37            }
38        }
39        reverse(nums,ind+1,nums.length-1);
40    }
41}