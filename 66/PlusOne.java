class Solution {
    public int[] plusOne(int[] digits) {
        int digitsLength = digits.length;
       
        int over = 0;
       
        if (digits[digitsLength - 1] == 9) {
            over = 1;
            digits[digitsLength - 1] = 0;
        } else {
            digits[digitsLength - 1] = digits[digitsLength - 1] + 1;
            return digits;
        }
       
        for (int i = digitsLength - 2; 0 <= i; i--) {
            if (over == 0) {
                return digits;
            }
           
           
            if (digits[i] == 9) {
                over = 1;
                digits[i] = 0;
            } else {
                over = 0;
                digits[i] = digits[i] + 1;
            }

        }
       
        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            int index = 0;
            for (int num : digits) {
                result[index + 1] = digits[index];
                index++;
            }
            return result;
        }
        return digits;
    }
}