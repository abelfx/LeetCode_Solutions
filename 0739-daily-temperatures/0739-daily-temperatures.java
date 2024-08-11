class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int length = temp.length;
        Stack<Integer> stack = new Stack();
        int[] answer = new int[length];

        for(int i =0; i < length; i++){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                answer[stack.peek()] = i - stack.pop();
            }

            stack.push(i);
        }

        return answer;
    }
}