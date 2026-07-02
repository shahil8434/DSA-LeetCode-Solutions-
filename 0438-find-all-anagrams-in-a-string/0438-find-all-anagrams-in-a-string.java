class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        HashMap<Character, Integer> Windowmap = new HashMap<>();
        for (int right = left; right < s.length(); right++) {
            char ch = s.charAt(right);
            Windowmap.put(ch, Windowmap.getOrDefault(ch, 0) + 1);
            if (right - left + 1 > p.length()) {
                char removeChar = s.charAt(left);

                Windowmap.put(removeChar, Windowmap.get(removeChar) - 1);

                if (Windowmap.get(removeChar) == 0) {
                    Windowmap.remove(removeChar);
                }

                left++;
            }
            if (right - left + 1 == p.length()) {
                if (map.equals(Windowmap)) {
                    list.add(left);
                }
            }
        }
        return list;
    }
}