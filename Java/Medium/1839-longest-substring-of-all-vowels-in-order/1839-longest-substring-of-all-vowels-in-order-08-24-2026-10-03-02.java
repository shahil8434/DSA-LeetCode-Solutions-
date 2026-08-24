class Solution {
    public int longestBeautifulSubstring(String word) {
        int left = 0;
        int max = 0;
        int count = 1;
      
        for(int right = 1; right < word.length() ; right++){
            if(word.charAt(right - 1) > word.charAt(right)){
                left = right;
                count = 1;
            }else if(word.charAt(right - 1) < word.charAt(right)){
                count++;
            }
            if(count == 5){
            max = Math.max(max, right - left + 1);
            }
        }
        return max;
    }
}