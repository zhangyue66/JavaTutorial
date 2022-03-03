class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> sHashMap = new HashMap<>(),tHashMap = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if (sHashMap.containsKey(s.charAt(i))) {
                sHashMap.put(s.charAt(i),sHashMap.get(s.charAt(i))+1);
            } else {
                sHashMap.put(s.charAt(i),1);
            }
            if (tHashMap.containsKey(t.charAt(i))) {
                tHashMap.put(t.charAt(i),tHashMap.get(t.charAt(i))+1);
            } else {
                tHashMap.put(t.charAt(i),1);
            }
        }
        int ans = 0;
        for (Character key:sHashMap.keySet()) {
            if (tHashMap.containsKey(key)) {
                if (tHashMap.get(key) <= sHashMap.get(key)) {
                    ans += (sHashMap.get(key)-tHashMap.get(key));
                }
            } else {
                ans += sHashMap.get(key);
            }
        }
        return ans;
    }
}
