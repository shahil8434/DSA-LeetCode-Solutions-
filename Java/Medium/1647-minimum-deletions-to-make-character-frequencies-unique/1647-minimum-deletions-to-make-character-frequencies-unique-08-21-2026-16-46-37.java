class Solution {
    public int minDeletions(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);

        }
        HashSet<Integer> usedfreq = new HashSet<>();
        int delete = 0;
        for (int freq : map.values()) {
            while (freq > 0 && usedfreq.contains(freq)) {
                freq--;
                delete++;
            }
            if (freq > 0) {
                usedfreq.add(freq);
            }
        }
        return delete;
    }
}