class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = map.get(nums[i]);
            if (num == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], num + 1);
            }
        }

        int maxCount = 0;
        int maxNum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        return maxNum;
    }
}