class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minprice = prices[0];
        int maxPro = 0;
        for(int i =0; i<n; i++){

            minprice = Math.min(minprice, prices[i]);
            int currPro = prices[i]-minprice;
            maxPro = Math.max(currPro, maxPro);

        }

        return maxPro;
    }
}