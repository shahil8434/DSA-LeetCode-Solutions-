class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = num + "";
        int count = 0;
        int ans = 0;
       for (int i = k - 1; i < s.length(); i++) {
                String sub = s.substring(i - k + 1, i + 1);
                int n = Integer.parseInt(sub);

                if (n != 0 && num % n == 0) {
                    ans++;
                }
        }
        return ans;
    }
}