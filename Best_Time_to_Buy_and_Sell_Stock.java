public class Best_Time_to_Buy_and_Sell_Stock {

  public static void main(String[] args) {
    int[] nums = new int[]{7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(nums));
  }

  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int price : prices) {
      maxProfit = Integer.max(price - minPrice, maxProfit);
      minPrice = Integer.min(minPrice, price);
    }
    return maxProfit;
  }
}