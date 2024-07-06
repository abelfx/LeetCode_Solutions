class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 0) return 0;
        
        StringBuilder s = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < n; i++) {
            if (chars[i] == chars[i - 1]) {
                count++;
            } else {
                s.append(chars[i - 1]);
                if (count > 1) {
                    s.append(count);
                }
                count = 1;  
            }
        }
        
        s.append(chars[n - 1]);
        if (count > 1) {
            s.append(count);
        }
        
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        
        return s.length();
    }
}