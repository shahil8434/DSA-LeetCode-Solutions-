class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int i = 1;
        int ans = 0;
        while (i <= n) {
            if (n % i == 0) {
                ans += nums[i - 1] * nums[i - 1];
            }
            i++;
        }
        return ans;
    }
}