import java.util.Stack;

class MyQueue {

    Stack<Integer> stackA;
    Stack<Integer> stackB;

    public MyQueue() {
        stackA = new Stack<>();
        stackB = new Stack<>();
    }

    public void push(int x) {
        stackA.push(x);
    }

    public int pop() {
        if (stackB.isEmpty() && stackA.isEmpty()) {
            // Both stacks are empty
            return -1; // Indicate underflow or empty queue
        }
        if (stackB.isEmpty()) {
            shifter();
        }
        return stackB.pop();
    }

    public int peek() {
        if (stackB.isEmpty()) {
            shifter();
        }
        return stackB.peek();
    }

    public boolean empty() {
        return stackA.isEmpty() && stackB.isEmpty();
    }

    public void shifter() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }
}
