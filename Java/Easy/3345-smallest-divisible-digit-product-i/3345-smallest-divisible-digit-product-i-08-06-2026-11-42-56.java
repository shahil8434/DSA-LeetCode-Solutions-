class Solution {
    private int check(int num){
        int mul = 1;
        while(num > 0){
            mul*= num % 10;
            num/= 10;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        int k = n;
        for(int i = k; i < n + 10; i++){
           int mul = check(i);
           if(mul % t == 0){
            return i;
           }
        }
        return -1;
    }
}