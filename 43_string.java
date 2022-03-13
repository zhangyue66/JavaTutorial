class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m=num1.length(),n=num2.length();
        int[] productArray = new int[m+n];
        for (int i=m-1;i>=0;i--) {
            for (int j= n-1;j>=0;j--) {
                int mul = (Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num2.charAt(j)));
                int p1=i+j,p2=i+j+1;
                int sum = mul+productArray[p2];
                productArray[p1] += sum/10;
                productArray[p2] = (sum%10);
            }
        }
        StringBuilder sb = new StringBuilder();
        //System.out.println(Arrays.toString(productArray));
        for (int k=0;k<m+n;k++) {
            if (k ==0 && productArray[k] == 0) {
              continue; 
            } else {
                sb.append(productArray[k]);
            }
            
        }
        return sb.toString();
    }
}
