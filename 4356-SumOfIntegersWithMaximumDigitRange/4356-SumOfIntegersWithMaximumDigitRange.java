// Last updated: 8/12/2026, 10:15:17 PM
class Solution {
    public int maxDigitRange(int[] nums) {
        int ans = 0;
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int temp = nums[i];
            while(temp!=0){
                int d = temp%10;
                if(d>max) max = d;
                if(d<min) min = d;
                temp/=10;
            }
            int digit = max-min;
            arr[i] = digit;
        }
        int maxdigit = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(arr[i] > maxdigit) maxdigit = arr[i];
        }

        for(int i=0;i<nums.length;i++){
            if(arr[i] == maxdigit) ans+=nums[i];
        }
        return ans;
    }
}