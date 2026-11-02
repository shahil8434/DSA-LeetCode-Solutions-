class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int ele = nums[nums.length / 2];

        for(int i = 0; i < nums.length; i++){
            ans += Math.abs(nums[i] - ele);
        }
        return ans;
    }
}