class Solution {
    public boolean isFascinating(int n) {

        String str = String.valueOf(n) 
                   + String.valueOf(2 * n)
                   + String.valueOf(3 * n);

        boolean[] seen = new boolean[10];

        for (char ch : str.toCharArray()) {

            int digit = ch - '0';

            if (digit == 0 || seen[digit]) {
                return false;
            }

            seen[digit] = true;
        }

        return true;
    }
}