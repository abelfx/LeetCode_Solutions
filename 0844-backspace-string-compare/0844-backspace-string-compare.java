class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack();
        Stack<Character> stack2 = new Stack();

        int i = 0;
        int j = 0;

        while(i<s.length()){
            if(s.charAt(i) == '#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                
                }
                i++;
                continue;
            }

            stack1.add(s.charAt(i));
            i++;
        }

        while(j<t.length()){
            if(t.charAt(j) == '#'){
                if(!stack2.isEmpty()){
                     stack2.pop();
                }
                j++;
                continue;
               
            }

            stack2.add(t.charAt(j));
            j++;
        }

        return stack1.equals(stack2);
      
    }
}