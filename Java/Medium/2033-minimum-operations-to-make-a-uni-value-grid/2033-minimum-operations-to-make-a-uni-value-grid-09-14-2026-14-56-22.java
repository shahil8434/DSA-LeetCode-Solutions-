class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int arr[] = new int[m * n];
        int k = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                arr[k++] = grid[i][j];
            }
        }
        int base = arr[0];
        Arrays.sort(arr);
        int target = arr[arr.length / 2];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] - base) % x != 0) {
                return -1;
            }

            ans += Math.abs(arr[i] - target) / x;
        }
        return ans;

    }
}