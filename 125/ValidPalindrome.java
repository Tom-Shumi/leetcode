class Solution {
  public boolean isPalindrome(String s) {
    StringBuilder reversedSb = new StringBuilder("");
    StringBuilder trimedSb = new StringBuilder("");

    for (int i = s.length() - 1; 0 <= i; i--) {
      String target = String.valueOf(s.charAt(i)).toLowerCase();
      if (target.matches("[a-zA-Z0-9]")) {
        reversedSb.append(target);
        trimedSb.insert(0, target);
      }
    }
    return reversedSb.toString().contentEquals(trimedSb);
  }
}