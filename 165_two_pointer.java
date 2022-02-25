class Solution {

    public int compareVersion(String version1, String version2) {
        String[] ver1Array = version1.split("\\.");
        String[] ver2Array = version2.split("\\.");
        // System.out.println(ver1Array.length);
        // System.out.println(Arrays.toString(ver1Array));
        // System.out.println(Arrays.toString(ver2Array));
        int i = 0;
        int j = 0;
        while (i < ver1Array.length && j < ver2Array.length) {
            if (compare(ver1Array[i],ver2Array[j]) == 1) {
                return 1;
            } else if (compare(ver1Array[i],ver2Array[j]) == -1) {
                return -1;
            }
            i++;
            j++;
        }
        if (i != ver1Array.length ) {
            while (i < ver1Array.length) {
                if (compare(ver1Array[i],"0") == 0) {
                    i++;
                } else {
                    return 1;
                }
            }
            return 0;
        }
        if (j != ver2Array.length ) {
            while (j < ver2Array.length) {
                if (compare(ver2Array[j],"0") == 0) {
                    j++;
                } else {
                    return -1;
                }
            }
            return 0;
        }
        return 0;
}
    
    final private int compare(String str1, String str2) {
        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        if (int1 > int2) {
            return 1;
        } else if (int1 < int2) {
            return -1;
        } else {
            return 0;
        }
    }
}
