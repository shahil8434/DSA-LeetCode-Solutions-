class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int s1 = 0;
        int s2 = 0;
        int count1  = 0;
        int count2  = 0;
        for(int i = 0; i < num.length(); i++){
           
            if(i < n/2){
                 if(num.charAt(i) == '?'){
                count1++;
            }else{
                s1+= num.charAt(i) - '0';
            }
            }else{
                 if(num.charAt(i) == '?'){
                count2++;
            }else{
                s2+= num.charAt(i) - '0';
            }
            }
        }
        
        if((count1 + count2) % 2 != 0 ){
            return true;
        }
        if(2*(s1 - s2) == 9*(count2 - count1)){
            return false;
        }
        return true;
    }
}