class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        int redSum = totalSum - x;
        int left = 0;
        int sum = 0;
        int subLen = 0;

        if (redSum < 0) {
            return -1;
        }
       
        for(int right = 0; right < n; right++){
            sum+= nums[right];

            while(sum > redSum){
                sum = sum - nums[left];
                left++;
            }

            if(sum == redSum){
              subLen = Math.max(subLen, right - left + 1);
            }
        }
        if (subLen == 0) {
            return redSum == 0 ? n : -1;
        }
        return n - subLen;
    }
}