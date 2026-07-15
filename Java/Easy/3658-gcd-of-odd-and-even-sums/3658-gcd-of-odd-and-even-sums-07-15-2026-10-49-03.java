class Solution {
    private int gcd(int sumOdd, int sumEven){
          int min = Math.min(sumOdd, sumEven);
          for(int i = min; i > 0; i--){
            if(sumOdd % i == 0 && sumEven % i == 0){
                return i;
            }
          }
          return 1;
    }
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i <= n * 2; i++){
            if(i % 2 == 0){
                sumEven+= i;
            }else{
                sumOdd+= i;
            }
        }
        return gcd(sumOdd, sumEven);
      
    }
}