class Solution {
    public int singleNumber(int[] nums) {
//         if (nums.length == 1) {
//             return nums[0];
//         }
        
//         int result;
        
//         Set<Integer> set = new HashSet<>();
        
//         for (int n : nums) {
//             if (set.contains(n)) {
//                 set.remove(n);
//             } else {
//                 set.add(n);
//             }
//         }
        
//         return (Integer) set.toArray()[0];
        int l = nums.length;
        int res = nums[0];
        for( int i = 1; i < l; i++ ){
            res ^= nums[i];
        }
        return  res;
    }
}