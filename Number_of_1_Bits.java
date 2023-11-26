public class Number_of_1_Bits {

  public static void main(String[] args) {
    System.out.println(hammingWeight(00000011111));
  }

  // you need to treat n as an unsigned value
  public static int hammingWeight(int n) {
    int result = 0;
    while(n != 0) {
      n = n & (n - 1);
      result++;
    }
    return result;
  }

}