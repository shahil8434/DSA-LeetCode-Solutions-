class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        if(n < k){
            return 0;
        }
        int ans = 0;
        int count = 1;
        for(int i = 1; i < n + k - 1; i++){
            if(colors[i % n] != colors[(i-1) % n]){
                count++;
            }else{
                count = 1;
            }
            if(count >= k){
                ans++;
            }
        }
        return ans;
    }
}