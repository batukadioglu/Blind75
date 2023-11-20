import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    System.out.println(isAnagram(s, t));
  }

  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> letterMap = new HashMap<>();
    for (char ch : s.toCharArray()) {
      letterMap.merge(ch, 1, Integer::sum);
    }

    for (char c : t.toCharArray()) {
      Integer value = letterMap.get(c);
      if (value != null) {
        if (value == 1) {
          letterMap.remove(c);
        } else {
          letterMap.compute(c, (k, v) -> v - 1);
        }
      } else {
        return false;
      }
    }
    return letterMap.size() == 0;

  }
}