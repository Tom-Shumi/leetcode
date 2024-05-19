class Solution {
  public boolean isPalindrome(int x) {
    //         String xStr = Integer.toString(x);
    //         StringBuilder sb = new StringBuilder(xStr);
    //         String xStrR = sb.reverse().toString();

    //         return xStr.equals(xStrR);
    String xStr = Integer.toString(x);
    int top = 0;
    int buttom = xStr.length() - 1;
    int mid = xStr.length() / 2;

    for (int i = 0; i < mid; i++) {
      if (xStr.charAt(top) != xStr.charAt(buttom)) {
        return false;
      }
      top++;
      buttom--;
    }
    return true;
  }
}