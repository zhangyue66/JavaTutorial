class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int i =0, j =0;
        while (i<s.length()) {
            if (j<spaces.length && spaces[j]== i) {
                sb.append(" ");
                j += 1;
            } else {
                sb.append(s.charAt(i));
                i += 1;
            }
        }
        
        return sb.toString();
        
    }
}
