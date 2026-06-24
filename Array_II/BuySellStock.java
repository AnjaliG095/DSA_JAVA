public class BuySellStock {
     public static int buysellstocks(int prices[]){
        int buyprice=Integer.MAX_VALUE; //+infifnity
        int maxProfit =0;
        for(int i =0; i<prices.length;i++){
            if(buyprice < prices[i]){ 
               int profit = prices[i] - buyprice;
                maxProfit=Math.max(maxProfit,profit);
            
            }else{
                buyprice =prices[i];

            }
        }
        return maxProfit;
    }
     public static void main(String[] args) {
         int prices[]={7,1,5,2,4};
         System.out.println(buysellstocks(prices));
     }

    }
