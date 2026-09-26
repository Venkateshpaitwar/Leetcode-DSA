// 735. Asteroid Collision

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() &&
                   stack.peek() > 0 &&
                   asteroid < 0) {
                int top = stack.peek();
                if (top < Math.abs(asteroid)) {
                    stack.pop();
                }
                else if (top == Math.abs(asteroid)) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }
        return ans;
    }
}