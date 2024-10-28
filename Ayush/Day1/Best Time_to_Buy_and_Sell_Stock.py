class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        s = prices[0]
        l = prices[0]
        maxProfit = 0
        for i in range(1,len(prices)):
            if prices[i]<s:
                s = prices[i]
            elif prices[i]>s:
                l = prices[i]
                if l-s>maxProfit:
                    maxProfit = l-s
        return maxProfit
