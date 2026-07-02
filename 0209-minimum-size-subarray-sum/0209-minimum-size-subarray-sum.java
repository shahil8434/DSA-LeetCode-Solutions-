class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        for(int right = left; right < n; right++){
            sum += nums[right];
            while(sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum-=nums[left];
                left++;
            }
            
        }
        if(minLength == Integer.MAX_VALUE){
            minLength = 0;
        }
        return minLength;
    }
}