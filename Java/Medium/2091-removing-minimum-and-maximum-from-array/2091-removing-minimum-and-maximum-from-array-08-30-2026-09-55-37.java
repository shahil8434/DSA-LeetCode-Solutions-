class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int a = 0;
        int min = Integer.MAX_VALUE;
        int b = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                a = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                b = i;
            }
        }
     
      int left = Math.max(a, b) + 1;
      int right = nums.length - Math.min(a, b);
      int both = Math.min(a, b) + 1 + nums.length - (Math.max(a, b));
      int ans = Math.min(both, Math.min(left, right)) ;
      return ans;
    }
}