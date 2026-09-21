class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;

        char ans[][] = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][m - 1 - i] = boxGrid[i][j];
            }
        }

        for (int j = 0; j < m; j++) {
                int empty = n - 1;
            for (int i = n - 1; i >= 0; i--) {
                if(ans[i][j] == '*'){
                    empty = i - 1;
                }else if(ans[i][j] == '#'){
                   if(empty != i){
                    ans[empty][j] = '#';
                    ans[i][j] = '.';
                   }
                   empty--;
                }
            }
        }
        return ans;
    }
}