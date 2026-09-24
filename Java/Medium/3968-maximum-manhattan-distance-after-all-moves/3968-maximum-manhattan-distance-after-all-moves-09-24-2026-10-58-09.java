class Solution {
    public int maxDistance(String moves) {
        int countL = 0;
        int countR = 0;
        int countU = 0;
        int countD = 0;
        int s = 0;

        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                countL++;
            } else if (ch == 'R') {
                countR++;
            } else if (ch == 'U') {
                countU++;
            } else if (ch == 'D') {
                countD++;
            } else {
                s++;
            }
        }
        int x = countR - countL;
        int y = countU - countD;
        int ans = Math.abs(x) + Math.abs(y) + s;
        return ans;
    }
}