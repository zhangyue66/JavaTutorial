class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        Stack stack = new Stack();
        int j =0;
        for (int i=0;i<len;i++) {
            stack.push(pushed[i]);
            while ( !stack.isEmpty() && j<len && (int) stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }
        return j == len;
    }
}
