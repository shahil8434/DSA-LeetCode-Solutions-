class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int[] d : dominoes) {

            int a = Math.min(d[0], d[1]);
            int b = Math.max(d[0], d[1]);

            int key = a * 10 + b;

            if (map.containsKey(key)) {
                ans += map.get(key);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return ans;
    }
}