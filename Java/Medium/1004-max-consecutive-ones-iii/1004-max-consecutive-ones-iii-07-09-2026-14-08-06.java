class Solution {
    private int help(int nums[], int k, int num) {
        int count = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == num) {
                count++;
            }

            while (count > k) {
                if (nums[left] == num) {
                    count--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        // if( k == 0 && maxLength == nums.length){
        //       return 0; 
        //     }
        return maxLength;
    }

    public int longestOnes(int[] nums, int k) {
        return help(nums, k, 0);
    }
}