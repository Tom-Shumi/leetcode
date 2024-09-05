class Solution {

  public String longestCommonPrefix(String[] strs) {
    String result = strs[0];
    if (result.equals("")) {
      return "";
    }

    for (int i = 1; i < strs.length; i++) {
      String temp = "";
      for (int j = 0; j < strs[i].length(); j++) {
        if (result.length() == j) {
          break;
        }

        if (result.charAt(j) == strs[i].charAt(j)) {
          temp = temp + result.charAt(j);
        } else {
          break;
        }
      }
      result = temp;
      if (temp.equals("")) {
        break;
      }
    }

    return result;
  }
}