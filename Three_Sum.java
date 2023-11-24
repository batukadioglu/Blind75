import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

  public static void main(String[] args) {
    System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      // in case of have the same number in the beginning, go to the last one
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int l = i + 1, r = nums.length - 1;
      while (l < r) {
        int sum = nums[i] + nums[l] + nums[r];
        // if the sum is negative, move the left pointer. (to higher)
        if (sum < 0) {
          l++;
          // if the sum is positive, move the right pointer. (to lower)
        } else if (sum > 0) {
          r--;
          // if the sum is zero, eureka!!!
        } else {
          result.add(List.of(nums[i], nums[l], nums[r]));
          // prevent duplication, move pointers until find a different number
          while (l < r && nums[l] == nums[l + 1]) {
            l++;
          }
          while (l < r && nums[r] == nums[r - 1]) {
            r--;
          }
          l++;
          r--;
        }
      }
    }
    return result;
  }
}