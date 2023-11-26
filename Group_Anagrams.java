import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {

  public static void main(String[] args) {
    System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> res = new ArrayList<>();
    if(strs.length==0) {
      return res;
    }
    HashMap<String, List<String>> map = new HashMap();
    for(String s : strs) {
      char[] hash = new char[26];
      for (char c : s.toCharArray()) {
        hash[c - 'a']++;
      }
      String hashString = new String(hash);
      if(map.get(hashString) == null){
        map.put(hashString, new ArrayList<>());
      }
      map.get(hashString).add(s);
    }
    res.addAll(map.values());
    return res;
  }

}