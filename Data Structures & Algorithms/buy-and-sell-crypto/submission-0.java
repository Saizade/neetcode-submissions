// Brute force
// class Solution {
//     public int maxProfit(int[] prices) {
//         int ans=0;
//         for(int i=0;i<prices.length;i++){
//             for(int j=i+1;j<prices.length;j++){
//                 int maxprofit=prices[j]-prices[i];
//                 ans=Math.max(maxprofit,ans);
//             }
//         }
//         return ans;
//     }
// }



// optimal
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
}