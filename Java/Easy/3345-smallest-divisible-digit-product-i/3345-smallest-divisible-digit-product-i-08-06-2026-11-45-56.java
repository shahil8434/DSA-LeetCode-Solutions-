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
        int i = n;
        while(true){
           if(check(i) % t == 0)
            return i;
           
           i++;
        }
       
    }
}