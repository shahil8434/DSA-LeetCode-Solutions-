class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int start = 0;
        int matched = 0;
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
         for (char c : t.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        for (int right = 0; right < n; right++) {
 
            char ch = s.charAt(right);
            
            if (map.containsKey(ch)) {
               
                if (map.get(ch) > 0) {
                    matched++;
                }
                map.put(ch, map.get(ch) - 1);
            }
              while (matched == t.length()) {

             
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        matched--;
                    }
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}