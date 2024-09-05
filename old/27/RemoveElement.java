class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] tempNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tempNums[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempNums[i] != val) {
                nums[k] = tempNums[i];
                k++;
            }
        }

        return k;
    }
}