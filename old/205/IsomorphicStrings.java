class Solution {
  public boolean isIsomorphic(String s, String t) {
    int sNumber = 1;
    int tNumber = 1;
    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();
    String sNumberStr = "";
    String tNumberStr = "";

    for (int i = 0; i < s.length(); i++) {
      Integer sc = sMap.get(s.charAt(i));
      if (sc == null) {
        sMap.put(s.charAt(i), sNumber);
        sNumberStr = sNumberStr + sNumber;
        sNumber++;
      } else {
        sNumberStr = sNumberStr + sc;
      }

      Integer tc = tMap.get(t.charAt(i));
      if (tc == null) {
        tMap.put(t.charAt(i), tNumber);
        tNumberStr = tNumberStr + tNumber;
        tNumber++;
      } else {
        tNumberStr = tNumberStr + tc;
      }
    }

    return sNumberStr.equals(tNumberStr);
  }
}