class Solution {
    public boolean scoreBalance(String s) {
        int left = 0;
        int right = 0;

        for (char ch : s.toCharArray()) {
            right += ch - 'a' + 1;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            int val = s.charAt(i) - 'a' + 1;
            left += val;
            right -= val;

            if (left == right) {
                return true;
            }
        }

        return false;
    }
}