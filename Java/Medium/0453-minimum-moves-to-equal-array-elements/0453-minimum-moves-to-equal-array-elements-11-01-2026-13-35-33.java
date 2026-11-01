class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int fst = nums[0];

        for(int i = 0; i < nums.length; i++){
            sum+= nums[i] - fst;
        }

        return sum;
    }
}