class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    if (nums.length == 0) {
      // 空のリストを返す簡単な方法
      return Collections.emptyList();
    }

    // これで一意な List<Integer> を格納できる。
    Set<List<Integer>> res = new HashSet<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      // i  は固定して、残りは two pointer アルゴリズムで解く。
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];
        if (sum == 0) {
          // 配列を List に変換して、Set に追加。
          res.add(Arrays.asList(nums[i], nums[left], nums[right]));
          left++;
          right--;
        } else if (sum > 0) {
          right--;
        } else if (sum < 0) {
          left++;
        }
      }
    }
    // Set を List に変換。
    return new ArrayList<>(res);
  }
}