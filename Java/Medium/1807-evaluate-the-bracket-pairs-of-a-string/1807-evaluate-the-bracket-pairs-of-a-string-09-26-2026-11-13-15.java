class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        String ans = new String();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);

            map.put(key, value);
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j++;
                }
                String str = s.substring(i + 1, j);
                if (map.containsKey(str)) {
                    ans += map.get(str);
                } else {
                    ans += '?';
                }
                i = j;
                
            } else {
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}