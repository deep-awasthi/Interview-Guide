int maxProfit(int* prices, int pricesSize) {
    int sell = 0;
    int smallprice = prices[0];
    for(int i =0; i<pricesSize;i++){
        if(prices[i]<smallprice){
            smallprice = prices[i];
        }
        int profit = prices[i] - smallprice;
        if(profit>sell){
            sell = profit;
        }
        
    }
    return sell;
}
