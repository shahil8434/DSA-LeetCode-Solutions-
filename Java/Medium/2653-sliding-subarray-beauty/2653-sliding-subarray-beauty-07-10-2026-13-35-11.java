class Solution {
    private int find(int[] freq, int x) {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            count += freq[i];
            if (count >= x) {
                return i - 50;
            }
        }
        return 0;
    }

    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101];
        int left = 0;
        int i = 0;
        for (int right = 0; right < n; right++) {
            freq[nums[right] + 50]++;
            if (right - left + 1 == k) {
                ans[i++] = find(freq, x);
                freq[nums[left] + 50]--;
                left++;
            }
        }
        return ans;
    }
}