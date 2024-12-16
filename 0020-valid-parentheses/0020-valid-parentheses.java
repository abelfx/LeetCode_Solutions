import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> checker = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '{' || current == '[') {
                checker.push(current);
            } 
     
            else {
               
                if (checker.isEmpty()) {
                    return false;
                }
                char last = checker.peek();
                if ((current == ')' && last == '(') || 
                    (current == '}' && last == '{') || 
                    (current == ']' && last == '[')) {
                    checker.pop(); 
                } else {
                    return false; 
                }
            }
        }

        
        return checker.isEmpty();
    }
}
