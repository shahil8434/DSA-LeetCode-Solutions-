class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long st = 1000;
        while(st <= n){
            ans += n - st + 1;
            st*= 1000;
        }
        return ans;
    }
}