class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            int cost = (i / 8) + 1;
            ans += list.get(i) * cost;
        }
        return ans;
    }
}