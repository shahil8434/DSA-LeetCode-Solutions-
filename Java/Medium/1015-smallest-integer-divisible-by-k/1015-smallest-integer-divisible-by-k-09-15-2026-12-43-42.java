class Solution {
    public int smallestRepunitDivByK(int k) {
       int count = 1;
       int rem = 1 % k;
       while(count <= k){
     
        if(rem == 0){
            return count;
        }
        rem = (rem * 10 + 1) % k;
        count++;
        
       } 
       return -1;
    }
}