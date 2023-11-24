import java.util.Arrays;

public class Product_of_Array_Except_Self {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
  }

  public static int[] productExceptSelf(int[] nums) {
    int product = 1;
    int[] result = new int[nums.length];

    // 1, 1, 2, 6
    // from beginning to end
    for (int i = 0; i < nums.length; i++) {
      result[i] = product;
      product *= nums[i];
    }

    // 24, 12, 8, 6
    // from end to beginning
    product = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      result[i] *= product;
      product *= nums[i];
    }

    return result;
  }
}