class Solution {

    public int sum(int num) {
        int total = 0;

        while (num > 0) {
            total += num % 10;
            num /= 10;
        }

        return total;
    }

    public int minSwaps(int[] nums) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        // Sort by digit sum, then by number
        Arrays.sort(arr, (a, b) -> {

            int s1 = sum(a[0]);
            int s2 = sum(b[0]);

            if (s1 != s2) {
                return Integer.compare(s1, s2);
            }

            return Integer.compare(a[0], b[0]);
        });

        boolean[] visited = new boolean[n];

        int ans = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || arr[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {

                visited[j] = true;

                j = arr[j][1];

                cycleSize++;
            }

            ans += cycleSize - 1;
        }

        return ans;
    }
}
