class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, n = prices.length,mi = prices[0];
        if(n==1){return 0;}
        for(int i = 1;i < n; i++){
            ans = Math.max(ans,prices[i]-mi);
            mi = Math.min(mi,prices[i]);
        }
        return ans;
    }
}