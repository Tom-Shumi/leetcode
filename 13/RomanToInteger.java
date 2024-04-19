class Solution {
  public int romanToInt(String s) {
    String[] sArray = s.split("");
    int result = 0;

    for (int i = 0; i < sArray.length; i++) {
      int value = convertValue(sArray[i]);

      if (i < sArray.length - 1) {
        int nextValue = convertValue(sArray[i + 1]);
        if (1 == value && (5 == nextValue || 10 == nextValue)) {
          value = nextValue - value;
          i++;
        } else if (10 == value && (50 == nextValue || 100 == nextValue)) {
          value = nextValue - value;
          i++;
        } else if (100 == value && (500 == nextValue || 1000 == nextValue)) {
          value = nextValue - value;
          i++;
        }
      }

      result = result + value;
    }

    return result;
  }

  private int convertValue(String s) {
    if ("I".equals(s)) {
      return 1;
    } else if ("V".equals(s)) {
      return 5;
    } else if ("X".equals(s)) {
      return 10;
    } else if ("L".equals(s)) {
      return 50;
    } else if ("C".equals(s)) {
      return 100;
    } else if ("D".equals(s)) {
      return 500;
    } else if ("M".equals(s)) {
      return 1000;
    }

    return 1;
  }
}