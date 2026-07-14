class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxele = 0;
        int maxcount = 0;
        int left = 0;
        long count = 0;
        for (int num : nums) {
            maxele = Math.max(maxele, num);
        }
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == maxele){
                maxcount++;
            }
            while(maxcount >= k){
                if(nums[left] == maxele){
                    maxcount--;
                }
                left++;
            }
            count+=left;
        }
        return count;
    }
}