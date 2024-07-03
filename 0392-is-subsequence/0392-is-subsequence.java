class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder builder = new StringBuilder();
        
        int i = 0;
        int j = 0;
        while(i < t.length() && j < s.length()){
            if(t.charAt(i) == s.charAt(j)){
                builder.append(t.charAt(i));
                j++;
            }
            i++;
        }

        if(s.equals(builder.toString())){
            return true;
        }

        return false;

        
    }
}