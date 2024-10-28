class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int res = 0;
        int curr = prices[0];
        for(int i = 1; i<prices.length; i++){
            res = Math.max(res, prices[i] - curr);
            curr = Math.min(curr, prices[i]);
        }
        return res;
    }
}
