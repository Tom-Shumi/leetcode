class Solution {
  public String reverseWords(String s) {
    String[] sArray = s.split(" ");
    String result = sArray[sArray.length - 1].replace(" ", "");
    if (sArray.length == 1) {
      return result;
    }

    for (int i = sArray.length - 2; 0 <= i; i--) {
      String ss = sArray[i].replace(" ", "");
      if (ss.equals("")) {
        continue;
      }
      result = result + " " + ss;
    }
    return result;
  }
}