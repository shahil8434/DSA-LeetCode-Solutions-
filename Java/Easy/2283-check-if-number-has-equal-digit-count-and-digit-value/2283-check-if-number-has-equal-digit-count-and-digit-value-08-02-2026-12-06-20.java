class Solution {
    public boolean digitCount(String num) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (char ch : num.toCharArray()) {
            int n = ch - '0';
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (map.getOrDefault(i, 0) != (num.charAt(i) - '0')) {
                return false;
            }
        }
        return true;
    }
}