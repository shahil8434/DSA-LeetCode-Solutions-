class Solution {
    public int check(String s){
        int count = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                count++; 
            }     
        }
        return count;
    }
   
    public int countRotations(String s, int k) {
         StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int ans = 0;
        
            for(int i = 0; i < sb.length(); i++){
                if(check(sb.toString()) == k){
                    ans++;
                }
                char temp = sb.charAt(0);

            for(int j = 0; j < n - 1; j++) {
                sb.setCharAt(j, sb.charAt(j + 1));
            }

            sb.setCharAt(n - 1, temp);
                }
            
        
        return ans;
    }
}