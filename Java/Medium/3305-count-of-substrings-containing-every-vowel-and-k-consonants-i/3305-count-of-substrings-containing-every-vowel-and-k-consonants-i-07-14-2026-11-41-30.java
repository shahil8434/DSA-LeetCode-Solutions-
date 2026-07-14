class Solution {
    private boolean isVowel(char c){
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    private boolean isValid(String s, int k){
        int count = 0;
        char[] c = s.toCharArray();
        Set set = new HashSet<>();
        for(char c1:c){
            if(isVowel(c1)){
                set.add(c1);
            }else{
                count++;
            }
        }
        return(set.size()  == 5 && count == k);
    }
    public int countOfSubstrings(String word, int k) {
        int count = 0;
        int i = 0;
        while(i <= word.length() -k - 5){
            int j = i + k + 5;
            while(j <= word.length()){
                String check = word.substring(i, j);
                if(isValid(check, k)){
                    count++;
                }
                j++;
            }
            i++;
        }
        return count;
    }
}