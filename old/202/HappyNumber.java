class Solution {
  public boolean isHappy(int n) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(n, 1);
    int target = n;
    while (true) {
      int result = happy(target);
      if (result == 1) {
        return true;
      }
      Integer m = map.get(result);
      if (m == null) {
        map.put(result, 1);
      } else {
        break;
      }
      target = result;
    }

    return false;
  }

  private int happy(int n) {
    String s = String.valueOf(n);
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      int snum = Character.getNumericValue(s.charAt(i));
      result = result + (snum * snum);
    }
    return result;
  }
}