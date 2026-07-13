class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int total = 0;
        int l = 0;
        for(int r = 0; r < nums.length; r++){
            if(nums[r] % 2 != 0 || nums[r] > threshold){
                continue;
            }
                l = r;
           while (l < nums.length &&
             nums[l] <= threshold &&
              (l == r || nums[l] % 2 != nums[l - 1] % 2)){
               l++;
            }
             total = Math.max(total, l - r );
        }
        return total;
    }
}