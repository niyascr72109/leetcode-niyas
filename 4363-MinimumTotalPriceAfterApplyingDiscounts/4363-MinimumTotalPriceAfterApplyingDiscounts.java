// Last updated: 8/12/2026, 10:15:15 PM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        long total = 0;
        for(int p:prices){
            total+=p;
        }

        double savings = 0;
        
        int m = prices.length;
        int n = discounts.length;
        int k = Math.min(m,n);

        for(int i=0;i<k;i++){
            savings += (double) prices[m-1-i] * discounts[n-1-i] / 100.0;
        }
        return total - savings;
    }
}