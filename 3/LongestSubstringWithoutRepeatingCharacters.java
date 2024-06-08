class Solution {
  public int lengthOfLongestSubstring(String s) {
    int len = s.length();
    HashSet set = new HashSet();
    int left = 0;
    int right = 0;
    int result = 0;
    while (right < len) {
      if (!set.contains(s.charAt(right))) {
        set.add(s.charAt(right));
        right++;
        result = Math.max(result, set.size());
      } else {
        set.remove(s.charAt(left));
        left++;
      }
    }
    return result;
  }
}