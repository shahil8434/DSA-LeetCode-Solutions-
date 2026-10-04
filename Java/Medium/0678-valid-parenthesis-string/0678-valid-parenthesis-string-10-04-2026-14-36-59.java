class Solution {
    public boolean checkValidString(String s) {
        int fst = 0;
        int sec = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                fst++;
                sec++;
            } else if (ch == ')') {
                fst--;
                sec--;
            } else {
                fst--;
                sec++;
            }
            if (sec < 0) {
                return false;
            }

            fst = Math.max(0, fst);
        }

        return fst == 0;
    }
}