class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        long [] sufixmin = new long[n];
        sufixmin[n - 1] = nums [n - 1];
        for(int i = n - 2; i >= 0; i--){
            sufixmin[i] = Math.min(nums[i], sufixmin[i + 1]);
        }
        long presum = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n - 1; i++){
            presum+= nums[i];
            ans = Math.max(ans, presum - sufixmin[i + 1]);
        }
        return ans;
    }
}