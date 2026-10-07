// 301. Remove Invalid Parentheses

class Solution {
    Set<String> result = new HashSet<>();
    int minRemove;
    public List<String> removeInvalidParentheses(String s) {
        minRemove = getMinRemove(s);
        backtrack(s, 0, "", 0, 0);
        return new ArrayList<>(result);
    }
    private void backtrack(String s, int index, String current, int balance, int removed) {
        if (removed > minRemove || balance < 0) {
            return;
        }
        if (index == s.length()) {
            if (balance == 0 && removed == minRemove) {
                result.add(current);
            }
            return;
        }
        char ch = s.charAt(index);
        if (ch == '(') {
            backtrack(s, index + 1, current + ch, balance + 1, removed);
        } else if (ch == ')') {
            backtrack(s, index + 1, current + ch, balance - 1, removed);
        } else {
            backtrack(s, index + 1, current + ch, balance, removed);
        }
        if (ch == '(' || ch == ')') {
            backtrack(s, index + 1, current, balance, removed + 1);
        }
    }
    private int getMinRemove(String s) {
        int balance = 0;
        int remove = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                if (balance > 0) {
                    balance--;
                } else {
                    remove++;
                }
            }
        }
        return remove + balance;
    }
}