// Last updated: 8/12/2026, 10:15:14 PM
class Solution {
    static long gcd(long a,long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a=temp;
        }
        return a;
    }
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long a = nums[i];
                long b = nums[j];
                long g = gcd(a,b);
                long strength = (a * b) / (g*g) ;
                max = Math.max(max,strength);
            }
        }
        return max;
    }
}