class Solution {
    public boolean judgeCircle(String moves) {
       int x=0;
        int y=0; 
       for(int i=0;i<moves.length();i++){
        char dir=moves.charAt(i);
         if(dir=='R'){
            x++;
         }else if(dir=='L'){
            x--;
         }else if(dir=='U'){
            y++;
         }else{
            y--;
         }
       }
       int ans=x*x+y*y;
       if(ans==0){
        return true;
       }
       return false;
    }
}