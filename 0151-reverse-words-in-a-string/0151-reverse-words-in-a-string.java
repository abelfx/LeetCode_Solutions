class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        String[] substring = s.split("\\s+"); 
        
        StringBuilder builder = new StringBuilder();
        
        for(int i = substring.length - 1; i >=0 ; i--){
            builder.append(substring[i]);
            if(i > 0)
            builder.append(" ");
        }
        return builder.toString();
    }
}