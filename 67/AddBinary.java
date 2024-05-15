class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int maxLength = a.length() < b.length() ? b.length() : a.length();
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;

        int over = 0;

        for (int i = maxLength - 1; 0 <= i; i--) {
            int aInt = 0;
            int bInt = 0;
            if (0 <= aPointer) {
                aInt = Character.getNumericValue(a.charAt(aPointer));               
            }
            if (0 <= bPointer) {            
                bInt = Character.getNumericValue(b.charAt(bPointer));
            }

            int sum = aInt + bInt + over;
            if (sum == 3) {
                over = 1;
                result = "1" + result;
            } else if (sum == 2) {
                over = 1;
                result = "0" + result;
            } else {
                over = 0;
                result = "" + sum + result;
            }
            aPointer--;
            bPointer--;
            
        }
        
        if (over == 1) {
            result = "1" + result;
        }
        return result;
    }
}