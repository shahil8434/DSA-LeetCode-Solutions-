class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return Total(nums, k) - Total(nums, k-1);
    }
    private int Total(int nums[], int k){
        if(k < 0){
            return 0;
        }
        int n = nums.length;
        int left = 0;
        int ans = 0;
        for(int right = 0; right < n; right++){
            if(nums[right] % 2 == 1){
                k--;
            }
            while(k < 0){
             if(nums[left] % 2 == 1){
                k++;
              }
              left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }
}