class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            int ele = fruits[right];
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            while (map.size() > 2) {
                  int freq = map.get(fruits[left]);
                freq--;
                map.put(fruits[left], freq);
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}