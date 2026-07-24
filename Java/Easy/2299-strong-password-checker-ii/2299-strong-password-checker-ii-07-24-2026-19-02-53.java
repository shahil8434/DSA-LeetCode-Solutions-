class Solution {
    public boolean strongPasswordCheckerII(String password) {
    
        int n = password.length();
        boolean dig = false, low = false, upp = false, special = false;
        String sp = "!@#$%^&*()-+";

        if(n < 8){
            return false;

        }
       
        for(int i = 0; i < n; i++){
            char ch = password.charAt(i);
            if(i > 0 && ch == password.charAt(i - 1)){
                return false;
            }

            if(ch >= '0' && ch <= '9'){
                dig = true;
            }else if(ch >= 'A' && ch <= 'Z'){
                upp = true;
            }else if(ch >= 'a' && ch <= 'z'){
                low = true;
              } else if (sp.indexOf(ch) != -1) {
                special = true;
            }
          }  

        return dig && upp && low && special;
    }
}