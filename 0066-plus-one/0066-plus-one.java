class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int lastindex = digits.length - 1;
        if (digits[lastindex] != 9) {
            digits[lastindex] = digits[lastindex] + 1;
            return digits;
        } 
        
        else {
            digits[lastindex] = 0;
            for (int i = lastindex - 1; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    return digits; // Return modified array after incrementing
                } 
                
                else {
                    digits[i] = 0;
                }
            }
            // If all digits are 9, create a new array with leading 1
            int[] temp = new int[length + 1];
            temp[0] = 1;
            return temp;
        }
    }
}