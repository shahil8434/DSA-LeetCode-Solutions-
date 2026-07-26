class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int n : time){
            int temp = n % 60;
            int need = (60 - temp) % 60;
            count+= map.getOrDefault(need, 0);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        return count;
    }
}