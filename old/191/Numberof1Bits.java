class Solution {
  public int hammingWeight(int n) {
    String nBinary = Integer.toBinaryString(n);
    int result = 0;

    for (int i = 0; i < nBinary.length(); i++) {
      char iChar = nBinary.charAt(i);

      if (iChar == '1') {
        result++;
      }
    }

    return result;
  }
}