class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 1) {
      return 1;
    }

    int result = 0;
    int rightIndex = 1;
    int count = 1;

    for (int i = 0; i < s.length(); i++) {
      count = 1;
      Set<Character> set = new HashSet<Character>();
      set.add(s.charAt(i));

      for (int j = i + 1; j < s.length(); j++) {
        char jChar = s.charAt(j);

        if (set.contains(jChar)) {
          break;
        }
        set.add(jChar);
        count++;
      }
      result = Math.max(result, count);
    }

    return result;
  }
}