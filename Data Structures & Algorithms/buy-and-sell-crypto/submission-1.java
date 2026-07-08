class Solution {
    public int maxProfit(int[] prices) {
      int _maxProfit = 0;
      int minValue= prices[0];

      for (int i = 0 ; i < prices.length ; i++){
        if(minValue > prices[i]){
            minValue=prices[i];
        }
        else if((prices[i]-minValue) > _maxProfit){
            _maxProfit=prices[i]-minValue;
        }
      }
      return _maxProfit;
    }
}
