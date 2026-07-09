class Solution {
    private int charReplace(String s, int k, char ch) {
        int count = 0;
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != ch) {
                count++;
            }
            while (count > k) {
                if (s.charAt(left) != ch) {
                    count--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public int characterReplacement(String s, int k) {
        int ans = 0;

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            ans = Math.max(ans, charReplace(s, k, ch));
        }

        return ans;
    }
}