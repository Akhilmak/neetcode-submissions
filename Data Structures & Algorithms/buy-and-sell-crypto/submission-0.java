class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[left]){
                left=i;
            }else{
                maxProfit=Math.max(maxProfit,prices[i]-prices[left]);
            }
        }
        return maxProfit;
    }
}
