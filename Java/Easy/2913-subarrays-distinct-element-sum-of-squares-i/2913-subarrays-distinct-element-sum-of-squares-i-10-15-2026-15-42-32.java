class Solution {
    public int sumCounts(List<Integer> nums) {

        int ans = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int dist = 0;
            boolean check[] = new boolean[101];
            for (int j = i; j < n; j++) {
                int x = nums.get(j);
                if (!check[x]) {
                    check[x] = true;
                    dist++;
                }
                ans += dist * dist;
            }
        }
        return ans;
    }
}