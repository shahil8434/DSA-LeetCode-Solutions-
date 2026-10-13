class Solution {
    public long maxAlternatingSum(int[] nums) {
       
       for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
       }

       Arrays.sort(nums);
       int n = nums.length;
       long score = 0;

        for(int i = 0; i < n/2; i++){
            score-= nums[i];
        }

        for(int i = n / 2; i < n; i++){
            score+= nums[i];
        }

        return score;
    }
}