public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            // Check if the current asteroid survives collision
            boolean survived = true;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < Math.abs(asteroid)) {
                    stack.pop(); // Destroy the smaller asteroid
                    continue;
                } else if (stack.peek() == Math.abs(asteroid)) {
                    stack.pop(); // Both asteroids destroy each other
                }
                survived = false;
                break;
            }
            if (survived) {
                stack.push(asteroid);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}