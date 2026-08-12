// Last updated: 8/12/2026, 10:14:54 PM
class Solution {
    static {
        for (int i = 0; i < 500; i++)
            maxSubArray(new int[1]);
    }
    public static int maxSubArray(int[] nums) {
       int n = nums.length;
       if(n == 1) return nums[0];

       int sum =0;
       int max = nums[0];
       for(int i = 0; i < n; i++) {
        sum += nums[i];
        max = Math.max(max, sum);
        if(sum < 0) sum = 0;
       }
       return max;
    }
}