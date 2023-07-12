import java.util.*;
public class Main {
    public static int maxProfit(int[] prices) {
        int buy_prices = prices[0];
        int sell_prices = prices[0];
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy_prices){
                buy_prices=prices[i];
                sell_prices=prices[i];
            }
            else if(prices[i]>buy_prices){
                sell_prices=prices[i];
            }
            int profit = sell_prices - buy_prices;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.print(maxProfit(prices));
    }
}