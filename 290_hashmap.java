class Solution {
    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");
        if (str.length != pattern.length()) {
            return false;
        }
        Map<Character, String> mapping = new HashMap<Character, String>();
        int n = str.length;
        Set<String> visited = new HashSet<String>();
        for (int i=0;i<n;i++) {
            char ch = pattern.charAt(i);
            // System.out.println(mapping.containsKey(ch));
            // System.out.println(ch);
            // System.out.println(str[i]);
            if (mapping.containsKey(ch) == false && visited.contains(str[i]) == false) {
                mapping.put(ch, str[i]);
                visited.add(str[i]);
                //System.out.println(mapping.get(ch));
                //System.out.println(str[i]);
            }
            else if (mapping.containsKey(ch) == true  && visited.contains(str[i]) == true && str[i].equals(mapping.get(ch)) ) {
                //System.out.println(mapping.get(ch));
                continue;
            }
            else {
                return false;
            }
        }
        return true;
        }      
    }
