class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
       
        String result = "";
       
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            map.put(i, "");
        }
       
        for (int i = 0; i < s.length(); i++) {
            if (numRows <= i) {
                break;
            }
            int target = i % numRows;
            map.put(target, map.get(target) + String.valueOf(s.charAt(i)));
        }
       
       
        int count = 1;
        int zigzagCount = numRows - 2;
        int base = numRows + zigzagCount;
        for (int i = numRows; i < s.length(); i++) {
            int target = i % base;
            
            if (target < numRows) {
                map.put(target, map.get(target) + String.valueOf(s.charAt(i)));
            } else {
                target = base - target;
                map.put(target, map.get(target) + String.valueOf(s.charAt(i)));
            }
        }
       
       
        for (int i = 0; i < numRows; i++) {
            result = result + map.get(i);
        }
        return result;
    }
}