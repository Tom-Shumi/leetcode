class Solution {
  public String intToRoman(int num) {
    String result = "";
    String numStr = String.valueOf(num);
    int numLength = numStr.length();

    for (int i = 0; i < numLength; i++) {
      int digits = numLength - i;
      char targetChar = numStr.charAt(i);
      int target = Character.getNumericValue(targetChar);

      if (digits == 4) {

        for (int j = 0; j < target; j++) {
          result = result + "M";
        }

      } else if (digits == 3) {
        result = convert(result, target, "C", "D", "M");
      } else if (digits == 2) {
        result = convert(result, target, "X", "L", "C");
      } else {
        result = convert(result, target, "I", "V", "X");
      }
    }

    return result;
  }

  private String convert(String result, int target, String r1, String r5,
                         String r10) {
    if (target == 4) {
      result = result + r1 + r5;
    } else if (target == 5) {
      result = result + r5;
    } else if (target == 9) {
      result = result + r1 + r10;
    } else if (5 < target) {
      result = result + r5;
      int loop = target - 5;
      for (int j = 0; j < loop; j++) {
        result = result + r1;
      }
    } else {
      for (int j = 0; j < target; j++) {
        result = result + r1;
      }
    }
    return result;
  }
}