class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.equals("")) {
            return true;
        } else if (t.equals("")) {
            return false;
        }

        int sIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
            if (sIndex == s.length()) {
                return true;
            }
        }
        return false;
    }
}