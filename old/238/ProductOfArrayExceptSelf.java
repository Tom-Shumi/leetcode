class Solution {
    public int[] productExceptSelf(int[] nums) {
       
        int[] answers = new int[nums.length];
        int result = 1;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result = result * nums[i];
            } else {
                zeroCount++;
            }
        }
       
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 1) {
                if (nums[i] == 0) {
                    answers[i] = result;
                } else {
                    answers[i] = 0;
                }
            } else if (2 <= zeroCount) {
                answers[i] = 0;
            } else {
                answers[i] = result / nums[i];
            }
        }
       
        return answers;
    }
}