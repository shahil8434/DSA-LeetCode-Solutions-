class Solution {
    public int minDeletion(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int length = 0;
        for (int num : nums) {
            if (length % 2 == 0) {
                length++;
            } else {
                if (num != nums[length + ans - 1]) {
                    length++;
                } else {
                    ans++;
                }
            }
        }
        if (length % 2 != 0) {
            ans++;
        }
        return ans;
    }
}