class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> windowMap = new HashMap<>();
        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            char ch = s2.charAt(right);
             windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
             if(right - left + 1 > s1.length()){
                     char leftChar = s2.charAt(left);

                    windowMap.put(leftChar,
                                windowMap.get(leftChar)-1);

                    if(windowMap.get(leftChar)==0){
                        windowMap.remove(leftChar);
                    }

                    left++;
             }
             if(right - left + 1 == s1.length()){
                if(map.equals(windowMap)){
                    return true;
                }
             }
        }
             return false;
    }
}