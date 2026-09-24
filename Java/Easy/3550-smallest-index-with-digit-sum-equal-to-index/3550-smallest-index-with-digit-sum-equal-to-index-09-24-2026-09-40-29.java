class Solution {
        public static int sum(int n){
            int temp = n;
            int total = 0;

            while(temp != 0){
                total+= temp % 10;
                temp = temp / 10;
            }
            return total;
        }

    public int smallestIndex(int[] nums) {
        
        for(int i = 0; i < nums.length; i++){
            if(sum(nums[i]) == i){
                return i;
            }
        }
        return -1;
    }
}