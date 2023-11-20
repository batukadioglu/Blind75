import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

  public static void main(String[] args) {
    int[] nums = new int[]{2, 7, 11, 15};
    int target = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> set = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (set.get(target - nums[i]) != null) {
            return new int[]{set.get(target - nums[i]), i};
        }
      set.put(nums[i], i);
    }
    return new int[]{};
  }
}