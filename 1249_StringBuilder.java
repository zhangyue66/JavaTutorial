class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open=0,close=0;
        for (char c:s.toCharArray()) {
            if (c == '(') {
                open += 1;
                sb.append(c);
            } else if ( c == ')') {
                if (open>close) {
                    close += 1;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        s = sb.toString();
        open=close=0;
        sb.setLength(0);
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) == ')') {
                close += 1;
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                if (close>open) {
                    open += 1;
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
}
