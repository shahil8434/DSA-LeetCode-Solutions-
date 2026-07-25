class Solution {
    public int maxProduct(int n) {
       String s = n + "";
       int max = 0;
       for(int i = 0; i < s.length() - 1; i++){
                int a = s.charAt(i) - '0';
            for(int j = i + 1; j < s.length(); j++){
                int b = s.charAt(j) - '0';
                int temp = a * b;
                max = Math.max(max, temp);
            }
       }
       return max;
    }
}