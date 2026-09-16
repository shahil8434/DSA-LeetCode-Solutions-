class Solution {
    static int count = 0;
    public static String Permutation(String s, String curr, int k) {

        if (s.length() == 0) {
            count++;
            if (count == k) {
                return curr + "";
            }
            return "";
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i + 1);
            String result = Permutation(newStr, curr + ch, k);
            if (!result.equals("")) {
                return result;
            }
        }

        return "";

    }

    public String getPermutation(int n, int k) {
        String str = "";
        int i = 1;
        count = 0;
        while(i <= n){
            str+= i + "";
            i++;
        }
        return Permutation(str, "", k);
    }
}