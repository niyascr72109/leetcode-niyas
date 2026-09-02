// Last updated: 9/2/2026, 9:59:14 AM
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int n : nums){
            if(n > max ) max = n;
        }

        boolean freq[] = new boolean[max+1];

        
        int start = 0;
        long sum = 0;
        long maxWeight = Integer.MIN_VALUE;
        for(int iter = 0; iter < nums.length; iter++){
        while(freq[nums[iter]]==true){
            
            freq[nums[start]]=false;
            sum-=nums[start];
            start++;
        }
        
        freq[nums[iter]]=true;
        sum+=nums[iter];

        if((iter - start) + 1 == k){
            maxWeight = Math.max(maxWeight, sum);
            freq[nums[start]]=false;
            sum-=nums[start];
            start++;
        }
        
        }
        if(maxWeight == Integer.MIN_VALUE ) return 0;
        return maxWeight;


    }
}