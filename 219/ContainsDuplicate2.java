class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer putNumIndex = map.get(nums[i]);

      if (putNumIndex != null) {
        if (i <= (putNumIndex + k)) {
          return true;
        }
      }
      map.put(nums[i], i);
    }
    return false;
  }
}