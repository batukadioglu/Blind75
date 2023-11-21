import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {

  public static void main(String[] args) {
    String s = "()[]{}";
    System.out.println(isValid(s));
  }

  public static boolean isValid(String s) {
    Stack<Character> characterStack = new Stack<>();
    Map<Character, Character> characterMap = Map.of('}', '{', ')', '(', ']', '[');
    for (var ch : s.toCharArray()) {
      Character closingChar = characterMap.get(ch);
      if (closingChar == null) {
        characterStack.add(ch);
      } else {
        if (characterStack.isEmpty())
          return false;
        char lastElement = characterStack.pop();
        if (!closingChar.equals(lastElement)) {
          return false;
        }
      }
    }
    return characterStack.size() == 0;
  }
}