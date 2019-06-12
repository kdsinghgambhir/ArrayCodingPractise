/*
Question Description :
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction 
(i.e., buy one and sell one share of the stock), 
design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int [] ar)
    {
        int buyPrice = ar[0];
        int maxProfit = 0;
        for(int i=0; i< ar.length; i++)
        {
            if(ar[i] < buyPrice)
            {
                buyPrice = ar[i];
            }
            else
            {
                int profit = ar[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock check = new BestTimeToBuyAndSellStock();
        int [] ar = new int[] {7,1,5,3,6,4};
        System.out.println(check.maxProfit(ar));
    }
}
