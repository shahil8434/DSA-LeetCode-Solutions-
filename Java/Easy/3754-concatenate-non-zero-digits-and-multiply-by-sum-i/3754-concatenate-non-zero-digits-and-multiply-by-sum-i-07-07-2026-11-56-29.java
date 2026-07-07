class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0;
        StringBuilder sb = new StringBuilder(); 
        while(n > 0){
            int k = n % 10;
            sum += k;
            if(k != 0){
                sb.append(k);
            }
            n = n / 10;
        }
        sb.reverse();
        if(sb.length() == 0){
            return 0;
        }
        long num = Long.parseLong(sb.toString());
        return num * sum;
    }
}