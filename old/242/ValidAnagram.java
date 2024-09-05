class Solution {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      Character ss = s.charAt(i);
      Character tt = t.charAt(i);

      Integer sValue = map.get(ss);
      if (sValue == null) {
        map.put(ss, 1);
      } else {
        map.put(ss, sValue + 1);
      }

      Integer tValue = map.get(tt);
      if (tValue == null) {
        map.put(tt, -1);
      } else {
        map.put(tt, tValue - 1);
      }
    }
    // Mapの中身が全部0ならtrue
    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
      if (entry.getValue() != 0) {
        return false;
      }
    }
    return true;
  }
}