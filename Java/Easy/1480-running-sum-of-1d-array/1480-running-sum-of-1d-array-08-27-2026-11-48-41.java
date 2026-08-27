class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int store = 0;
        for (int i = 0; i < nums.length; i++) {
            store += nums[i];
            ans[i] = store;
        }
        return ans;
    }
}