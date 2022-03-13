class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c:s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (!stack.empty() && stack.pop() == c ) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
