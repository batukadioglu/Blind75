public class Valid_Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
  }

  public static boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;
    while (l < r) {
      char leftChar = s.charAt(l);
      char rightChar = s.charAt(r);
      if (!Character.isLetterOrDigit(leftChar)) {
        l++;
      } else if (!Character.isLetterOrDigit(rightChar)) {
        r--;
      } else {
        if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
          return false;
        }
        l++;
        r--;
      }
    }
    return true;
  }

}