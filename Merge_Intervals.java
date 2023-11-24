import java.util.Arrays;
import java.util.LinkedList;


public class Merge_Intervals {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
  }

  public static int[][] merge(int[][] intervals) {
    LinkedList<int[]> merged = new LinkedList<>();
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    for (var interval : intervals) {
      // if the list of merged intervals is empty or if the current
      // interval does not overlap with the previous, simply append it.
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      }
      // otherwise, there is overlap, so we merge the current and previous
      // intervals.
      else {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }
    return merged.toArray(new int[merged.size()][]);
  }

}