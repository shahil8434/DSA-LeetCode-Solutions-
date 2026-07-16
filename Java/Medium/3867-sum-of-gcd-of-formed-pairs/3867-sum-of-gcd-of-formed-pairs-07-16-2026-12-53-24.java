class Solution {
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int max[] = new int[n];
        max[0] = nums[0];

        for(int i = 1; i < n; i++){
          max[i]  = Math.max(nums[i], max[i - 1]);
        }

        for(int i = 0; i < n; i++){
            pre[i] = gcd(nums[i], max[i]);
        }

        Arrays.sort(pre);
        int i = 0;
        int j = pre.length - 1;
        long sum = 0;

        while(i < j){
            sum += gcd(pre[i], pre[j]);
            i++;
            j--;
        }
        return sum;
    }
}