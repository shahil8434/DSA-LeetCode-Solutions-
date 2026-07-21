class Solution {
    private int reverse(int nums){
        int rev = 0;
        while(nums > 0){
            rev*= 10;
            rev+= nums % 10;
            nums/= 10;
        }
        return rev;
    }
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            
            Integer index = map.get(nums[i]);
            if (index != null) {
                ans = Math.min(ans, i - index);
            }
            map.put(reverse(nums[i]), i);

        }
        if(ans == Integer.MAX_VALUE)
        return -1;
        return ans;
    }
}