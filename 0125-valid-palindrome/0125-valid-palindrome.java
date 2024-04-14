class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase();
        String done = result.replaceAll("[^a-z0-9]", "");
    
        String reversed = "";
        
        for(int i = done.length() -1; i>=0; i--){
            reversed += done.charAt(i);
        }
        
        if(reversed.equals(done)){
            return true;
        }
        return false;
        
    }
}