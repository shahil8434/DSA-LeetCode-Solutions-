class Solution {
    public long coloredCells(int n) {
        long a = 1L * n * n;
        long b = 1L * (n - 1) * (n - 1);
        long ans =  a + b; 
        return (long) ans;
        
    }
}