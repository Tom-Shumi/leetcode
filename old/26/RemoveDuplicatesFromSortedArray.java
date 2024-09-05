class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;
        int target = -101;
        for (int i = 0; i < nums.length; i++) {
            if (target < nums[i]) {
                nums[k] = nums[i];
                target = nums[i];
                k++;
            }
        }
        return k;
    }
}