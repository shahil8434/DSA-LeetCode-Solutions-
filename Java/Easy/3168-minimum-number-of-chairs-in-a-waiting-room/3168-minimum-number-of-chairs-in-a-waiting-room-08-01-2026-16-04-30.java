class Solution {
    public int minimumChairs(String s) {
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                temp++;
            }else{
                temp--;
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}