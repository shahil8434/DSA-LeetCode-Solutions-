class Solution {
    public int findGCD(int[] nums) {
     Arrays.sort(nums);
        int n=nums.length;
        int f=nums[0];
        int l=nums[n-1];
        while (f!=0){
            if(nums[0]%f==0 && l%f==0)
                break;
            f--;
        }
        return f;
    }
}