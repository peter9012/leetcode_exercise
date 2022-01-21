package Best_Time_to_Buy_and_Sell_Stock_with_Cooldown_309;

public class Solution {
  public static int maxProfit(int[] prices) {

    int sold = Integer.MIN_VALUE, held = Integer.MIN_VALUE, reset = 0;

    for (int price : prices) {
      int preSold = sold;

      sold = held + price;
      held = Math.max(held, reset - price);
      reset = Math.max(reset, preSold);
    }

    return Math.max(sold, reset);
  }

  public static void main(String args[])
  {
    int[] prices = {1, 2, 3, 0, 2};
    System.out.println(maxProfit(prices));
  }
}
