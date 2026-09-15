class Solution {
    public int pivotInteger(int n) {
        int i = 1;
        int TotalSum = 0;
        while(i <= n){
            TotalSum+= i;
            i++;
        }
        i = 1;
        int preSum = 0;
        while(i <= n){
            preSum += i;
            if(TotalSum == preSum * 2 - i ){
                return i;
            }
            i++;
        }
        return -1;
    }
}