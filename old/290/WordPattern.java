class Solution {
  public boolean wordPattern(String pattern, String s) {
    int patternIndex = 0;
    char space = ' ';
    String temp = "";
    String patternCheck = "";
    Map<String, Character> sMap = new HashMap<>();
    Map<Character, String> pMap = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == space || i + 1 == s.length()) {
        if (i + 1 == s.length()) {
          temp = temp + s.charAt(i);
        }
        Character cPattern = sMap.get(temp);
        if (cPattern == null) {
          if (patternIndex >= pattern.length()) {
            return false;
          }
          sMap.put(temp, pattern.charAt(patternIndex));
          patternCheck = patternCheck + pattern.charAt(patternIndex);

          String ss = pMap.get(pattern.charAt(patternIndex));
          if (ss == null) {
            pMap.put(pattern.charAt(patternIndex), temp);
          } else {
            return false;
          }
        } else {
          patternCheck = patternCheck + cPattern;
        }
        temp = "";
        patternIndex++;
      } else {
        temp = temp + s.charAt(i);
      }
    }

    return pattern.equals(patternCheck);
  }
}