class Solution {
  public List<String> summaryRanges(int[] nums) {

    String ARROW = "->";
    List<String> result = new ArrayList<>();
    if (nums.length == 0) {
      return result;
    } else if (nums.length == 1) {
      result.add("" + nums[0]);
      return result;
    }
    List<Integer> temp = new ArrayList<>();
    temp.add(nums[0]);

    for (int i = 1; i < nums.length; i++) {
      int num = nums[i];

      if ((num - 1) == temp.get(temp.size() - 1)) {
        temp.add(num);
      } else {
        if (1 < temp.size()) {
          result.add(temp.get(0) + ARROW + temp.get(temp.size() - 1));
        } else {
          result.add("" + temp.get(0));
        }
        temp = new ArrayList<>();
        temp.add(num);
      }
    }

    String lastNum = "" + nums[nums.length - 1];

    if (result.size() == 0 || !result.get(result.size() - 1).equals(lastNum)) {
      if (1 < temp.size()) {
        result.add(temp.get(0) + ARROW + temp.get(temp.size() - 1));
      } else {
        result.add(lastNum);
      }
    }
    return result;
  }
}