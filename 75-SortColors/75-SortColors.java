// Last updated: 10/19/2026, 8:48:20 AM
1class Solution {
2    static void swap(int nums[],int a,int b){
3        int temp = nums[a];
4        nums[a] = nums[b];
5        nums[b] = temp;
6    }
7    public void sortColors(int[] nums) {
8        int low = 0;
9        int mid = 0;
10        int high = nums.length-1;
11        while(mid<=high){
12            if(nums[mid] == 0){
13                swap(nums,low,mid);
14                mid++;
15                low++;
16            }
17            else if(nums[mid] == 1){
18                mid++;
19            }
20            else{
21                swap(nums,mid,high);
22                high--;
23            }
24        }
25    }
26}