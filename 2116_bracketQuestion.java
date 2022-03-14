class Solution {
    public boolean canBeValid(String s, String locked) {
        int len = s.length();
        if (len%2 != 0) {
            return false;
        }
        // we should focus on 1) balance out ')' 2) balance out "("
        int closeCounter=0,openCounter=0;
        int flex=0;
        for (int i=0;i<len;i++) {
            Character cur = s.charAt(i);
            if (locked.charAt(i) == '0') {
                flex += 1;
            } else if (cur == ')') {
                closeCounter += 1;
            } else {
                openCounter+= 1;
            }
            if (flex-closeCounter+openCounter<0) {
                return false;
            }
        }
        closeCounter=0;
        openCounter=0;
        flex=0;
        for (int j=len-1;j>=0;j--) {
            Character cur = s.charAt(j);
            if (locked.charAt(j) == '0') {
                flex += 1;
            } else  if (cur == '(') {
                openCounter+=1;
            } else {
                closeCounter+=1;
            }
            if (flex-openCounter+closeCounter<0) {
                return false;
            }
        }
        return true;
    }
}
