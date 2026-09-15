class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int ans = 0;
        while(temp != 0){
            ans*= 10;
            ans+= temp % 10;
            temp/= 10;
        }
        if(x < 0){
            return false;
        }
        if(ans == x){
            return true;
        }
        return false;
    }
}