class Solution {
    public String removeStars(String s) {
       Stack<Character> stack = new Stack();
	        StringBuilder builder = new StringBuilder();
	        
	        for(char i: s.toCharArray()){
	            if(i == '*'){
	                stack.pop();
	            }else{
	                stack.push(i);
	            }
	        }
	        
	        for(char i: stack){
	            builder.append(i);
	        }
	            
	        return builder.toString();
            
            
        
    }
}