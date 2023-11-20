import java.util.*;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numbersFound = new HashSet<>();
        for (int number : nums) {
            if (numbersFound.contains(number)) {
                return true;
            }
            numbersFound.add(number);
        }
        return false;
    }
}