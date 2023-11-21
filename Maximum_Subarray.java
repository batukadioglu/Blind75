public class Maximum_Subarray {

  public static void main(String[] args) {
    System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  public static int maxSubArray(int[] nums) {
    int maxSum = Integer.MIN_VALUE;
    int curSum = 0;
    for (int num : nums) {
      if (curSum < 0) {
        curSum = 0;
      }
      curSum += num;
      maxSum = Integer.max(maxSum, curSum);
    }
    return maxSum;
  }
}