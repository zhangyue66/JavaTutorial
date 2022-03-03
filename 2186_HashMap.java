class Solution {
    public int minSteps(String s, String t) {
        int ans =0;
        HashMap<Character,Integer> sMap = convertToMap(s),tMap = convertToMap(t);
        for (Character c:sMap.keySet()) {
            if (tMap.get(c) == null) {
                ans += sMap.get(c);
            } else {
                ans += Math.abs(sMap.get(c)-tMap.get(c));
            }
        }
        for (Character c:tMap.keySet()) {
            if (sMap.get(c) == null) {
                ans += tMap.get(c);
            }
        }
        return ans;
    }
    private HashMap convertToMap(String s) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        for (char c:s.toCharArray()) {
            if (sMap.get(c)!=null) {
                sMap.put(c,sMap.get(c)+1);
            } else {
                sMap.put(c,1);
            }
        }
        return sMap;
    }
}
