class Solution {
    public boolean checkDivisibility(int n) {
        int sum= 0;
        int temp = n;
        int mul = 1;
        while(temp > 0){
            int k = temp % 10;
            sum+= k;
            mul*= k; 
            temp/= 10;
        }
        return n % (sum + mul) == 0;
    }
}