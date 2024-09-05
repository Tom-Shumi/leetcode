public class Solution {
  // you need treat n as an unsigned value
  public int reverseBits(int n) {
    int result = 0;
    String nStr = String.format("%032d", n);
    int baseNum = 1;

    // for (int i = 0; i < 32; i++) {
    //     char nChar = nStr.charAt(i);
    //     if (nChar == '1') {
    //         result = result + baseNum;
    //     }
    //     baseNum = baseNum * 2;
    // }

    for (int i = 0; i < 32; i++) {
      int curBit = (n >> i) & 1;
      result += (curBit << (31 - i));
    }

    return result;
  }
}
