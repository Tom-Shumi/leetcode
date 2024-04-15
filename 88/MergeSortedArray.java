class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums2.length == 0) {
            return;
        }    

        int[] tempNums1 = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (i < m) {
                tempNums1[i] = nums1[i];
            } else {
                tempNums1[i] = Integer.MAX_VALUE;
            }
        }

        int nums1Count = 0;
        int nums2Count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums2Count == n || tempNums1[nums1Count] < nums2[nums2Count]) {
                nums1[i] = tempNums1[nums1Count];
                nums1Count++;
            } else {
                nums1[i] = nums2[nums2Count];
                nums2Count++;
            }
        }
    }
}