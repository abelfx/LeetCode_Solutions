import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> mapper = new HashMap<>();
        
        mapper.put('I', 1);
        mapper.put('V', 5);
        mapper.put('X', 10);
        mapper.put('L', 50);
        mapper.put('C', 100);
        mapper.put('D', 500);
        mapper.put('M', 1000);
        
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(i + 1 <s.length() && mapper.get(s.charAt(i)) < mapper.get(s.charAt(i+1))){
                result -= mapper.get(s.charAt(i)) ;
            }
                  
            else {
                result +=mapper.get(s.charAt(i)) ;
                
             }
        }
        
        return result;
        
    }
}